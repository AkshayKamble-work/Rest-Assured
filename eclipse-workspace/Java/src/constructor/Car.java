package constructor;

public class Car {

	String model; int year;
	
	
	public Car(String model, int year)
	{
		this.model=model;
		this.year=year;
	}
	public void Display() {

		System.out.println("Model -->" + model + " Year -->" + year);

		// Null 0 , 0 ,0 , Default model , 2020
	}
	
	public static void main(String[] args) {
		
		Car c=new Car("Maruti", 2024);
		c.Display();
	}
	
}
