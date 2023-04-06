package oops;

public class VehicleMain {
    public static void main(String[] args) {
    	
		Vehicle t = new Truck("RED", 12);
		t.model();
		t.fuel();
		t.colorAndWheels();
		
	    System.out.println("=========================================");
	    
		Vehicle b = new Bus("BLUE" , 10);
		b.model();
		b.fuel();
		b.colorAndWheels();
		
	    System.out.println("=========================================");	

		Vehicle c = new Car("BLACK" , 4);
		c.model();
		c.fuel();
		c.colorAndWheels();
	}
}
