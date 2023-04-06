package oops;

public class Worker {
	private String name;
	private int salaryRate;

	public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
    
	public void pay(int hours) {
		
	}
}
