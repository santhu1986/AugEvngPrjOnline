package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library Lb=new Library();
				
		Lb.OpenApp("http://103.211.39.246/ranford2/");
		Lb.AdminLgn("Admin","TestingMindq");
		
		//To Get Test Data File Path
		
		String Fpath="D:\\OnlinePrjJuly\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
		//Results File Path
		
		String Rpath="D:\\OnlinePrjJuly\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		//To get Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		//Multiple Iterations ---- Loop 
		
		while ((SD=BR.readLine())!=null)
		{
		    System.out.println(SD);
		    
		    //Split
		    
		    String SR[]=SD.split("###");
		    
		             String Rname=SR[0];
		             String Rtyp=SR[1];
		             
		            String Res=Lb.Role(Rname,Rtyp);
		            System.out.println(Res);
		            
		            //Results
		            
		            BW.write(SD+"$^$^$&"+Res);
		            BW.newLine();
		            
		          }

		     BW.close();
		     BR.close();
}
}