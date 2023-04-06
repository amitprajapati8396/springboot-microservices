package oops;

public class SalariedWorker extends Worker {

	public SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}
    
	@Override
	public void pay(int hours) {
		if (hours >= 40) {
			int days = hours / 8;
			int salary = super.getSalaryRate() * days;
			System.out.println("worker " + super.getName() + " will get salary " + salary);
		}
		else System.out.println("work days must be 5 days.");
	}
}
