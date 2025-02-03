package modifiers;

public class Test 
{
	public void Test()
	{
		System.out.println("I am publlic method");
	}
	
	private void namePrivate() 
	{
		System.out.println("I am private method");
	}
	
	protected void nameProtected() {
		System.out.println("I am protected method");
	}
	
	
	

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.Test();
		t.namePrivate();
		
		
	}
}
