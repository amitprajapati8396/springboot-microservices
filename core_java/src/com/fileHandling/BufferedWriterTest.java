package com.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
       
		//create the object of Writer
		
				Writer fw = new FileWriter("myFile");
				
				//create the object of BufferedWriter
				
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("abc");
				bw.newLine();
				bw.write("xyz");
				bw.newLine();
				bw.write(100);
				
				bw.close();
				
				System.out.println("data written succesfully");
	}
}
