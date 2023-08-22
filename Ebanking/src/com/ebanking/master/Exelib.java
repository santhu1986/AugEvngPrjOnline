package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	   
		//Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://103.211.39.246/ranford2/");
		System.out.println(Rval);
		LB.AdminLgn("Admin","TestingMindq");
		Rval=LB.Bcreation();
		System.out.println(Rval);
		LB.Role("Teller","E");
	}

}
