package interfaces;

public class Car  implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is starting...!!!");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping...!!!");
		
	}

	@Override
	public void speed() {
		System.out.println("Car speed is :: "+speed);
		
	}

}
