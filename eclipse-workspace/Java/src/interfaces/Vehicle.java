package interfaces;

public interface Vehicle {
	/*
	 interface is similar to java class but 100% abstract in nature we can archive 100% abstraction by using implement keyword
	 data member are static and final in nature 
	 method in interface 100% in abstract
	  object of interface can not created 
	  block and constructor are not allow in interface
	 */
	void start();
	void stop();
	void speed();
	public static final double speed = 50;

	// Default method
	default void fuelStatus() {
		System.out.println("Fuel status: Sufficient.");
	}


}
