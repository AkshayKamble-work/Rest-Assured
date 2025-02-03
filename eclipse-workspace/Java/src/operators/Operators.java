package operators;

public class Operators {
	
	
	public static void main(String[] args) {
		
		/*
		 Operators are classified into 
		 1) Arithmetic operators
		 2) Logical Operators
		 3) Conditional Operators
		 4)
		 
		 */
		
		// Arithmetic  +,-,%,* incremental ++, --,
		
		int x=10;
		int y=30;
		int c=x+y;
		System.out.println("Addition of X and Y is "+c);
		
		System.out.println("Susbtraction of X and Y Is "+(x-y));
		System.out.println("Multiplication of X and Y Is "+(x*y));
		System.out.println("Division of X and Y Is "+(x%y));
		
		
		int a=10;
		
		System.out.println("Value of A is Before using Increment Operator :: "+a);
		// Increment Operator
		a++;
		System.out.println("Value of A is After using Increment Operator :: "+a);
		// Decrement Operator
		--a;
		
		System.out.println("Value of A is After using Increment Operator :: "+a);
		
		int A=5;
		A+=5;
		System.out.println("Value of A is :: "+A);
		
	}

}
