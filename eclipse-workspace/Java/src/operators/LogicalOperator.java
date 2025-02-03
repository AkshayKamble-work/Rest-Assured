package operators;

public class LogicalOperator {

	/*

==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	x <= y
	 */

	public static void main(String[] args) {

		int x=10;
		int y=20;
		// And && Operator X is less than 20 and y is greater than 10 if both condition is true than result will be true otherwise false

		System.out.println("X is less than 20 and Y is greater than 10  :: "+(x<20 && y>10));
		// OR Operator || Returns true if one of the statements is true
		System.out.println("X is less than 20 and Y is greater than 10  :: "+(x<20 || y>10));
		// !
		System.out.println("Reverse the result, returns false if the result is true :: "+!(x<20 && y>10));
		// !=	Not equal	x != y	
		System.out.println("X is not Equal to Y "+" :: "+(x!=y));

		System.out.println("X is less than Y :: "+(x<y));
		System.out.println("Y is Greater than X :: "+(y>x));
		System.out.println("Greater than or equal to :: "+(x>=y));
		System.out.println("Greater than or equal to :: "+(x<=y));
		

	}
}
