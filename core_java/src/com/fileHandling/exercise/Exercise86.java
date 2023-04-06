package com.fileHandling.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise86 {
	public static void main(String[] args) throws Exception {
		File file = new File("batchmates");
		file.createNewFile();
		PrintWriter pw = new PrintWriter("batchmates");
		pw.println("Peter");
		pw.println("Scott");
		pw.println("Xavior");
		pw.close();

		// Create the object for FileReader

		FileReader fr = new FileReader("batchmates");

		int x = fr.read();

		while (x != -1) {
			// type conversion
			System.out.print((char) x);
			x = fr.read();
		}
	}
}
