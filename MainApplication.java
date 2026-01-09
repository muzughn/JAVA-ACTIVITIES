package M2_Activity6;

public class MainApplication {

	public static void main(String[] args) {
		 Car car = new Car(6,"Jaguar");
		 Truck truck = new Truck(12,"Toyota");
		 
		 
		 car.startEngine();
		 car.refuel();
		 car.honk();
		 
		 truck.startEngine();
		 truck.refuel();
		 truck.honk();
		 
		 destroyVehicle(car);
		 destroyVehicle(truck);
	}
	
	static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}
}
