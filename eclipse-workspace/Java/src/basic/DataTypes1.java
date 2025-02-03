package basic;

public class DataTypes1 
{
// Syntax Datatype dataname = Value
String name="ACCC";
static int t=10;

	
public void test()
{
	int a=10;
	System.out.println(a);
}
	
public static void myStatic()
{
	System.out.println("Static method");
}

public void nonstatic()
{
	System.out.println("None static method");
}
	
	public static void main(String[] args)
	{
		DataTypes1 a=new DataTypes1();
		a.test();
		a.nonstatic();
		myStatic(); // calling to static method 1 way (Direct call)
		
		DataTypes1.myStatic();// calling static method 2 way
		// classname with varible
		System.out.println(DataTypes1.t);
		
		DataTypes1.t=200;
		System.out.println(DataTypes1.t);
		
		System.out.println("Hello");
		System.out.print("Hello");
		System.out.print(DataTypes1.t);
		System.out.print(DataTypes1.t);
		
				
	}
}
