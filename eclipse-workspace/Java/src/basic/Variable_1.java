package basic;

public class Variable_1 {

	public static void main(String[] args) {
		
		// Variable  Declaration
		
		String First_Name;
		String Last_Name;
		String Address;
		double Age;
		String EmailID;
		String DOJ;
		double salary;
		char EmployeCode;
		
		// Assigning the value to variable
		
		First_Name="Vamsi";
		Last_Name="Rentala";
		Age=25;
		EmailID="VamsiRentala@gmail.com";
		DOJ="01/01/2021";
		salary=50000;
		EmployeCode='A';
		
		// Usage of variable
		
		System.out.println(First_Name);
		System.out.println(Last_Name);
		System.out.println(Age);
		System.out.println(DOJ);
		System.out.println(salary);
		System.out.println(EmployeCode);
		System.out.println();
		System.out.println("*************************");
		System.out.println();
		
		// Concatenation is addition of variable and joining the two variable
		
		System.out.println("First Name :: "+First_Name);
		System.out.println("Last Name :: "+Last_Name);
		System.out.println("Age :: "+Age);
		System.out.println("Date of Joining :: "+DOJ);
		System.out.println("Salary :: "+salary);
		System.out.println("Employe Code :: "+EmployeCode);
	}
}
