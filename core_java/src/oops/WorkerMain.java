package oops;

public class WorkerMain {
	public static void main(String[] args) {
        
		Worker dailyWorker =  new DailyWorker("Peter", 1500);
		dailyWorker.pay(24);
		
		Worker salariedWorker =  new SalariedWorker("Scott",2000);
		salariedWorker.pay(30);
	}
}
