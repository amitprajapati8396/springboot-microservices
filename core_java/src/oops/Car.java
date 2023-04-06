package oops;

public class Car extends Vehicle {
	public Car(String color, int wheelsNo) {
		super(color, wheelsNo);

	}

	@Override
	public void model() {
		System.out.println("Mahindra XUV");
	}

	@Override
	public void fuel() {
		System.out.println("Petrol Car");
	}
   
	@Override
	public void colorAndWheels(){
		System.out.println("Car Color : "+super.color + " And Wheels : "+super.WheelsNo);
	}
}
