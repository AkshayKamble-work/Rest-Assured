package methods;

import basic.Test;

public class Methods2 {
	
	public void Test3()
	{
		System.out.println("Test non static method is runing Test 3");
	}
	
	public static void Test4()
	{
		System.out.println("Test static method is runing Test 4");
	}

	
	public static void main(String[] args) {
		
		// Call static method from different class Class name + Method name like Method1.Test();
		Method1.Test(); 
		Method1.Test2();
		Methods2.Test4();
		// Object creation syntax
		 Methods2 m=new Methods2();
		 m.Test3();// calling to non static method
	}
}
