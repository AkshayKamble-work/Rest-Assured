package basic;

public class Test {

	public static void main(String[] args) {



		Test t=new Test(); // Object Creation
		t.Details(); // Method calling

	}

	public void Details()// Method
	{
		String Fname="Ashwini";
		String Lname="Sable";
		double Age=30;
		String Marriage_Status="Married";
		String DOB="28/5/1994";
		String EmployeeCode="Ak9028190004";
		Float Salary= 7500000f;
		String DOJ="01/04/2024";

		System.out.println("First name is => "+Fname);
		System.out.println("Last name is => "+Lname);
		System.out.println("Age is => "+Age);
		System.out.println("Marriage Status => "+Marriage_Status);
		System.out.println("Date of Birth is => "+DOB);
		System.out.println("Employee Code is => "+EmployeeCode);
		System.out.println("Salary => "+Salary);
		System.out.println("Date of Joining => "+DOJ);

	}

}
