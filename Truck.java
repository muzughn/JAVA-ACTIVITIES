package M2_Activity6;

public class Truck extends Vehicle implements Refuelable {
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels,brand);
	}
	
	@Override
	public void startEngine() {
		System.out.println (getBrand().toUpperCase() + ": engines starting... ");
	}
	
	@Override
	public void refuel() {
		System.out.println (getBrand().toUpperCase() + " is now refueling.");
	}
	

	@Override
	public void honk() {
		System.out.println (getBrand().toUpperCase() + " honks: HOOOOOOONK!!");
	}
}
