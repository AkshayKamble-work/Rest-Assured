package methods;

public class MethodOverloading {

	/*
	 Declare multiple method in same class with same name but different in parameter is called method overloading OR
	 multiple methods can have the same name with different parameters
	 */
	
	
	public static void Test()
	{
		System.out.println("Hello");
	}
	public static void Test(int a, int b)
	{
		System.out.println("Addition of A and B is :: "+(a+b));
	}
	
	public static void Test(int age, String Name)
	{
		System.out.println("Age is :: "+age);
		System.out.println("Name is :: "+Name);
	}
	public static void main(String[] args) 
	{
	
		Test();
		Test(101, 49);
		Test(19, "Ram");
		

	}
}
