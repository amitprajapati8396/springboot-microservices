package oops;

public class Vehicle {
    protected String color ;
    protected int WheelsNo;
	
    
	public Vehicle(String color, int wheelsNo) {
		super();
		this.color = color;
		WheelsNo = wheelsNo;
	}
    

	public void model(){
		System.out.println("Vehicle Model");
	}
	
	public void fuel(){
		System.out.println("Vehicle Fuel");
	}
	
	public void colorAndWheels(){
		System.out.println("Vehicle color and Wheels");
	}
	
	protected void display(){
		System.out.println("Display method from Vehicle class");
	}
}
