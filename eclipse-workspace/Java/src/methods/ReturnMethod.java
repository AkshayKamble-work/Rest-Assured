package methods;

public class ReturnMethod {

	
	static int myMethod(int x)
	{
		return 5+x;
	}
	
	static int add(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println(myMethod(10));
		
		int c=add(10,20);
		System.out.println(c);
		
		int d=add(50, 55);
		System.out.println(d);
		System.out.println(add(55, 50));
	}
}
