package methods;

public class Method1 {
	
	public static void Test()
	{
		System.out.println("Test 1 static Method");
	}
	
	public static void Test2()
	
	{
		System.out.println("Test 2 static Method");
	}

	
	public static void main(String[] args) {
		
		// Object Creation 
	//	Method1 m=new Method1();
	//	m.Test();
	//	m.Test2();
		
		Test();
		Test2();// Direct method calling
		
		modifiers.Test t=new modifiers.Test();
		t.Test();
	}
}
