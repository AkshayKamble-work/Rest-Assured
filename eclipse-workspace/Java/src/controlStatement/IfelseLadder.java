package controlStatement;

public class IfelseLadder 

/*
 Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
 */

{

	public static void main(String[] args) 
	{
		int Day = 7;

		if (Day < 1) { // false
			System.out.println("Monday");
		} else if (Day < 2) { // false true
			System.out.println("Tuesday");
		} else if (Day <3) { // false
			System.out.println("Wedneday");
		} else if (Day< 4) { // false
			System.out.println("Thuesday");
		} else if (Day< 5) { // True
			System.out.println("Friday");
		} else {
			System.out.println("Weekend");
		}
	}


}
