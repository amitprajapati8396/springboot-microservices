package com.fileHandling.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class Exercise90 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        String rollNo =  scn.nextLine();
        
        try (OutputStream output = new FileOutputStream("class.properties")) {

            Properties prop = new Properties();

            // set the properties value
            prop.put(name,rollNo);
      

            // save properties 
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
	}
}
