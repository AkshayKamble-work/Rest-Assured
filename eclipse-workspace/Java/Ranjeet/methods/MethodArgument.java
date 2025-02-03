package methods;

public class MethodArgument {

	public void methodArug1(int x, int y)
	{
		int c=x+y;
		System.out.println("Value of X is :: "+x);
		System.out.println("Value of Y is :: "+y);
		System.out.println("Additional of X and Y is:: "+c);
	}
	
	
	public static void methodArug(int x, int y)
	{
		int c=x+y;
		System.out.println("Value of X is :: "+x);
		System.out.println("Value of Y is :: "+y);
		System.out.println("Additional of X and Y is:: "+c);
	}
	
	
	public void Name(String Fname)
	{
		System.out.println("First name is ::"+Fname);
	}
	
	public int add() { // without arguments
	      int x = 30;
	      int y = 70;
	      int z = x+y;
	      return z;
	   }
	
	public static void main(String[] args) {
		
		MethodArgument ma=new MethodArgument();
		ma.methodArug1(10, 20);
		methodArug(20, 20);
		ma.Name("Java");
		
		int add = ma.add();
	      System.out.println("The sum of x and y is:"+add);
	}
}
