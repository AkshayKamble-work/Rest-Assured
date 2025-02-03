package basic;

public class LocalGlobalVariable {
	
	/* Global variable
	Declare variable outside the method body or block constructors is called as global variable
	access scope of global variable is throughout the class body 
	global variable store inside the heap area
	its is permanent variable
	
	*/
	String globalVariable="Global";
	
	public void Test()
	{
		String localvariable="Local";
		
		System.out.println(localvariable+"Local variable are not accessable outside the method body");
		
		/*
	Declare the variable inside the method body or block is called local variable
	Access scope of local variable is limited only inside the method
	its is temporary variable
	default value concept is not applicable
	
	 local variable store inside the stack 
		*/
	}
	
	

	public static void main(String[] args) 
	{
	
		LocalGlobalVariable l=new LocalGlobalVariable();
		System.out.println(l.globalVariable);
		l.Test();
		
		
	}
}
