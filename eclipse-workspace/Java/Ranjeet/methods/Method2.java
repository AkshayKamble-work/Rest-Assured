package methods;

public class Method2 {

	public static void java()
	{
		String name ="Java Concept";
		System.out.println(name);
	}
	
	public static void Automation()
	{
		String name="Automation cocepts";
		System.out.println(name);
	}
	
	public void  softwaretesting()
	{
		System.out.println("Software Testing knowledge is Required for automation testing");
	}
	
	public static void main(String[] args) 
	
	{
		
		// calling static method
		
		Method2.java();
		Method2.Automation();
		
		
		// non static methods
		 Method2 m=new Method2();
		 m.softwaretesting();
		 // // calling static method from another class
		 Method1.method2();
		 
	}
}
