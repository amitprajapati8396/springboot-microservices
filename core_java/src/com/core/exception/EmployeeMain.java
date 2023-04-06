package com.core.exception;

public class EmployeeMain {
  
	public static void main(String[] args) {
		String name =args[0];
		int age = Integer.parseInt(args[1]);
		
		Employee emp =  new Employee();
		
		try {
			emp.setName(name);
			emp.setAge(age);
				
		}
		catch (DuplicateName e) {
			System.out.println(e.getMessage());			
		} 
		
		catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
	 
		System.out.println(emp);
	}
	
}
