package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception {
		//Create the object for BufferedReader
		
				BufferedReader br = new BufferedReader(new FileReader("myFile"));
				
				String s = br.readLine();
				
				while(s!=null)
				{
					System.out.println(s);
					s=br.readLine();
				}
				
	}
}
