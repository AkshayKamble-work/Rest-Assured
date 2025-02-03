package methods;

public class Method1 {
	
	// method is block of code it will execute when we called it or it is set of instructions

	public void methods()
	{
		// non static method 
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of A and B is :: "+c);
	}
	
	// static method
	
	public static void method2()
	{
		int A=10;
		int b=20;
		int c=A*b;
		System.out.println("Multiplecation is A and B is :: "+c);
	}
	
	public static void main(String[] args) 
	{
		
		// Object creation
		Method1 m=new Method1(); // non static method calling 
		m.methods();
		
		// static method calling, we can directly calling static method with help of class name + method name
		Method1.method2();
		
		// calling static method from another class
		Method2.Automation();
		Method2.java();
	}

}
