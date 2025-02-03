package inheritance;

public class Paytm extends AirIndia{
	
	double price=2000;
	int seats;
	String dates="11/11/2024";
	String time="10:AM";
	double coupancode=500;
	double totalBill;
	
	public void Greeting()
	{
		System.out.println("Welcome to paytm flight book");
	}
	
	public void book()
	{
		System.out.println("Ticket price is "+price);
		System.out.println("Seats selected "+seats);
		System.out.println("Flight time is "+time);
		System.out.println("Flight date is "+dates);
		totalBill=price*seats;
		System.out.println("Total Bill is "+totalBill);
	}
	
	
	public void AppliedCoupan()
	{
		System.out.println("Ticket price is "+price);
		System.out.println("Seats selected "+seats);
		totalBill=price*seats;
		totalBill=totalBill-coupancode;
		System.out.println("Total price after applied coupan"+totalBill);
		System.out.println("Total Bill is "+totalBill);
	}
	
	

}
