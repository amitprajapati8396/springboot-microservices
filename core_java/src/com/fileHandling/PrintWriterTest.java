package com.fileHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class PrintWriterTest {
	public static void main(String[] args) throws Exception {
		//Create the object for PrintWriter
		
				java.io.PrintWriter pw = new PrintWriter("myFile");
				
				
				//write the data
				
				pw.println("abc");
				pw.println("xyz");
				pw.print(100);
				
				pw.close();
				
				System.out.println("data writeen succesfully");
	}
}
