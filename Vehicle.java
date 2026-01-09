package M2_Activity6;

public abstract class Vehicle {
	private int numberOfWheels;
	private String brand;

	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.setBrand(brand);
	}
	
	abstract void startEngine();
	
	public void destroy() {
		System.out.println (getBrand().toUpperCase() + " has been destroyed! ");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
