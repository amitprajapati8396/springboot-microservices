package oops;

public class Truck extends Vehicle {

	public Truck(String color, int wheelsNo) {
		super(color, wheelsNo);
	}

	@Override
	public void model() {
		System.out.println("TATA C3");
	}

	@Override
	public void fuel() {
		System.out.println("Deisel Truck");
	}
	@Override
	public void colorAndWheels(){
		System.out.println("Truck Color : "+super.color + " And Wheels : "+super.WheelsNo);
	}
}
