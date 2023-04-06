package com.fileHandling.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise87 {
	public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        String string = scn.nextLine();
        System.out.println(string);
        
        File file = new File("char");
        file.createNewFile();
        
        PrintWriter pw = new PrintWriter("char");
        pw.println(string);
        
        FileReader fr = new FileReader("char");

		int x = fr.read();
        int count = 0;
		while (x != -1) {
			count++;
			// type conversion
			System.out.print((char) x);
			x = fr.read();
			
		}
		System.out.println("Number of charcter : "+count);
	}
}
