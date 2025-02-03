package inheritance;

public class TestFlight {

	
	public static void main(String[] args) {
		
		AirIndia A=new AirIndia();
		A.Greeting();
		A.seats=2;
		A.Airbook();
		System.out.println();
		Paytm p=new Paytm();
		p.Greeting();
		p.seats=2;
		p.book();
		System.out.println();
		
		p.AppliedCoupan();
	}
}
