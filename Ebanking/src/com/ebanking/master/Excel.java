package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library Lb=new Library();
		
		Lb.OpenApp("http://103.211.39.246/ranford2/");
		Lb.AdminLgn("Admin","TestingMindq");
		
		//To Get Test Data File
		
		FileInputStream FIS=new FileInputStream("D:\\OnlinePrjJuly\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//Work Book
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Row Count
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		//Multiple Iterations ---- Loop
		
		for (int i=1;i<=Rcount;i++)
		{
			//Rows
			
			XSSFRow WR=WS.getRow(i);
			
			//Cells
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rtype=WC1.getStringCellValue();
			
			//Role Creation
			
			String Res=Lb.Role(Rname,Rtype);
			System.out.println(Res);
			
		    WC2.setCellValue(Res);
		    
	}
		FileOutputStream FOS=new FileOutputStream("D:\\OnlinePrjJuly\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(FOS);
		WB.close();
		
}

}
