package com.fileHandling;

import java.io.File;
import java.io.FileWriter;

public class Test1 {

	public static void main(String[] args) throws Exception {
		File file = new File("myFile");

		file.createNewFile();
		System.out.println(file.exists());
		
		FileWriter fw = new FileWriter("myFile");
		fw.write("ABC\n");
		fw.write("XYZ\n");
		fw.write(100);
		fw.close();
		System.out.println("Data written successfully.");
	}
}
