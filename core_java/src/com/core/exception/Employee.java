package com.core.exception;

public class Employee {
	
	String name="";
	
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) throws DuplicateName {
	  if(this.name.equalsIgnoreCase(name)){
		  throw new DuplicateName("please do not enter duplicate name.");
	  }
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAge {
		if(age<18 || age > 60){
			throw new InvalidAge("Age must be in between 18 to 60 ");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
   
	
}
