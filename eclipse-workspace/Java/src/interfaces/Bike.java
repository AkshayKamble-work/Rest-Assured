package interfaces;

public class Bike implements Vehicle {

	@Override
	public void start() {
		 System.out.println("Bike starting ...!!!");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike stopping ...!!!");
		
	}

	@Override
	public void speed() {
		System.out.println("Bike speed is :: "+speed);
		
	}

}
