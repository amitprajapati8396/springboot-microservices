package com.fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	
	public static void main(String[] args) throws Exception {
        
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("citius"));
		
		Student st1 = new Student();
		
		st1.setSid(100);
		st1.setSname("Amit");
		oos.writeObject(st1);
		
		oos.close();
		
		System.out.println("serialziation process has done");
		
		
	}
}
