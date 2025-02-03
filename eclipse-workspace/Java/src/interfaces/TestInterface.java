package interfaces;

public class TestInterface {

	
	public static void main(String[] args) {
		
		
		// Create objects of Car and Bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Call methods on Car
        System.out.println("Car actions:");
        car.start();
        car.fuelStatus();
        car.speed();
        car.stop();

        System.out.println();

        // Call methods on Bike
        System.out.println("Bike actions:");
        bike.start();
        bike.fuelStatus();
        bike.speed();
        bike.stop();
	}
}
