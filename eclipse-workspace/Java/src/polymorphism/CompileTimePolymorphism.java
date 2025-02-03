package polymorphism;

public class CompileTimePolymorphism 
{
/*
 object binding is Method Declaration and definition at the of compile time
 Compile-time polymorphism occurs when multiple methods in the same class have the same name but different parameter lists.
 static polymorphism or early binding
 */
	public void Addition(int a, int b)
	{
		System.out.println("Value of A is :: "+a);
		System.out.println("Value of B is :: "+b);
		System.out.println("Addition of A and B is :: "+(a+b));
	
	}
	
	public void Addition(double a, double b)
	{
		System.out.println("Value of A is :: "+a);
		System.out.println("Value of B is :: "+b);
		System.out.println("Addition of A and B is :: "+(a+b));
	
	}
	
	public void Addition(double a, double b, double c)
	{
		System.out.println("Value of A is :: "+a);
		System.out.println("Value of B is :: "+b);
		System.out.println("Value of C is :: "+c);
		System.out.println("Addition of A and B is :: "+(a+b+c));
	
	}
	
	public static void main(String[] args) {
		
		
		CompileTimePolymorphism co=new CompileTimePolymorphism();
		co.Addition(10, 20);
		System.out.println();
		co.Addition(5, 4);
		System.out.println();
		co.Addition(15, 20, 80);
	}
}
