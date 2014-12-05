package com.it.sources.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMArea {

	public static void main(String[] args) {
		try
		{
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	     String s =  bufferRead.readLine();
	     int clientValue1=Integer.parseInt(s);
		ATM atm = new ATM();
		atm.insertClientValue(clientValue1);
		}
		catch(IOException ex){
			
		}
	}

}
