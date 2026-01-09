package M2_Activity3;

public class Car {
	private String brand;
	private String color;
	private int speed;
	
	//Method not arguments
	public Car() {
		
	}
	//Parameterized Constructor
	public Car(String brand,String color,int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	//Method to display Car Details
	public void displayCarDetails() {
		System.out.println("Brand of Car: " + this.brand);
		System.out.println("Color       : " + this.color);
		System.out.println("Speed       : " + this.speed + " KPH ");
	}
	
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
