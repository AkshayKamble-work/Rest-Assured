package methods;

public class ParameterMethod {

	static void checkAge(int age)
	{
		if (age<18)
		{
		System.out.println("Access denied - You are not old enough!");	
		}
		else
		{
			System.out.println("Access granted - You are old enough!");
		}
		
	}
	
	
	public void weight(int kg)
	{
		
		if (kg<60) //55<60
		{
		System.out.println("You are not over weighted person");	
		}
		else
		{
			System.out.println("You are over weighted person");	
		}
	}
	
	public static void main(String[] args) 
	{
	
		checkAge(19);
		ParameterMethod m=new ParameterMethod();
		m.weight(55);
		
		
		
	}
}
