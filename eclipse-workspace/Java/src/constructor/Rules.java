package constructor;

//1.Constructor name must be the same as its class name.
//2. We can not create Constructor inside the method/function
//3.You should not declare any return type for the constructor (like void).
//or No Return Type: Constructors do not have a return type.
//by mistake if u have added void in the constructor creation time so compiler will treated as a method.
//4.Applicable modifiers - public , private, protected, default
//Not applicable modifiers - Static, Final, Abstract, native
public class Rules {




	public Rules() {

		System.out.println("Welcome");

	}

	public void Rule2() {

		System.out.println("Hello");
	}


	public static void main(String[] args) {


		Rules R1  = new Rules();  

		/*
			 //2. We can not create Constructor inside the method/function


			  public Rules()
			  {

			  }
		 */
	}


}



