package oops;

public class AnimalMain {
	public static void main(String[] args) {
      Animal l =  new Lion();
      l.canClimb();
      l.isVegeterian(); 
      
      System.out.println("===================================");
      
      Animal p = new Panther();
      p.canClimb();
      p.isVegeterian();
	}
}
