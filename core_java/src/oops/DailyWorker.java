package oops;

public class DailyWorker extends Worker {

	public DailyWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}

	@Override
	public void pay(int hours) {
		int days = hours/8;
		int salary = super.getSalaryRate() * days;
		System.out.println("worker "+ super.getName() + " will get salary Rs. "+salary+"/-"); 
	}
}
