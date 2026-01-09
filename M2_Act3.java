package M2_Activity3;

public class M2_Act3 {

public static void main(String[] args) {
		
		// Car object1 constructor no arguments
		Car BMW = new Car();
			
			System.out.println(" ============ Car Details ============");
			System.out.println("Car 1 info: ");
			BMW.setBrand("Jaguar");
			BMW.setColor("Black");
			BMW.setSpeed(110);
			BMW.displayCarDetails();
			
		// Car object2 parameterized
		Car Jeep = new Car("Audi","Red",100);
		
			System.out.println(" ============ Car Details ============");
			System.out.println("Car 2 info: ");
			Jeep.getBrand();
			Jeep.getColor();
			Jeep.getSpeed();
			Jeep.displayCarDetails();
			System.out.println();
			

	}

}
