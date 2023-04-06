package oops;

public class Bus extends Vehicle {
	public Bus(String color, int wheelsNo) {
		super(color, wheelsNo);
		
	}

	@Override
	public void model() {
		System.out.println("TATA BUS");
	}

	@Override
	public void fuel() {
		System.out.println("Deisel Bus");
	}
	
	@Override
	public void colorAndWheels(){
		System.out.println("BUS Color : "+super.color + " And Wheels : "+super.WheelsNo);
	}
}
