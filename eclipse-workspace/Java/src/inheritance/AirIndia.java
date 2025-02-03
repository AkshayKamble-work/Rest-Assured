package inheritance;

public class AirIndia {

	double price=2000;
	int seats;
	String dates="11/11/2024";
	String time="10:AM";
	double totalBill;
	
	public void Airbook()
	{
		System.out.println("Ticket price is "+price);
		System.out.println("Seats selected "+seats);
		System.out.println("Flight time is "+time);
		System.out.println("Flight date is "+dates);
		totalBill=price*seats;
		System.out.println("Total Bill is "+totalBill);
	}
	
	public void Greeting()
	{
		System.out.println("Welcome to Air india flight book");
	}
}
