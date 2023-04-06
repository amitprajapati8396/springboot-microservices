package com.fileHandling.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exercise95 {
     public static void main(String[] args) throws Exception, IOException {
    	 ObjectOutputStream oos = 
 				new ObjectOutputStream(new FileOutputStream("citius"));
    	 
    	 Employee emp = new Employee();
 		
 		emp.setEmp_id("CT1110");
 		emp.setEmp_name("Amit");
 		emp.setEmp_sal(50000);
 		oos.writeObject(emp);
 		
 		oos.close();
 		
 		System.out.println("serialziation process has done");
 		
 		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("citius"));
		
		Employee emp1= (Employee)ois.readObject();
		
		System.out.println("Employee id: " + emp1.getEmp_id());
		System.out.println("Employee name: " +emp1.getEmp_name());
		System.out.println("Employee sal : "+emp1.getEmp_sal());
	}

}
