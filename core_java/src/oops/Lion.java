package oops;

public final class Lion extends Animal {
	@Override
	public void canClimb() {
		System.out.println("No , Lion can not climb.");
	}

	@Override
	public void isVegeterian() {
		System.out.println("No , Lion is not vegeterian.");
	}
}
