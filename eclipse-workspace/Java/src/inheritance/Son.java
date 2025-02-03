package inheritance;

public class Son extends Father {
	
	
	public void bike()
	{
		System.out.println("Son ki Bike");
	}

	
	public static void main(String[] args) {
		
		
		Son s=new Son();
		s.bike();
		s.Car();
		s.Home();
		s.Money();
	}
}
