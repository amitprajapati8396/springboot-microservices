package com.fileHandling.exercise;

import java.io.Serializable;

public class Employee implements Serializable {
	private String emp_name;
	private String emp_id;
	private transient double emp_sal;

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}

}
