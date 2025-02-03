package thisKeyword;

public class Accenture {
	
	String profile;
	String Name;
	float salary;
	double idcard;
	
	public Accenture(String Name, String profile, float salary, double idcard)
	{
	
		this.Name=Name;
		this.profile=profile;
		this.salary=salary;
		this.idcard=idcard;
	}
	
	void login ()
	{
		System.out.println("Details of Employee ::");
		System.out.println("Name :: "+Name);
		System.out.println("Profile :: "+profile);
		System.out.println("Salary :: "+salary);
		System.out.println("ID card :: "+idcard);
		System.out.println();
		System.out.println("Details are correct..!!");
	}
	
	public static void main(String[] args) {
		
		Accenture ac=new Accenture("Akshay", "Senior Quality Engineer", 500000, 1234f);
		ac.login();
		System.out.println();
		Accenture ac1=new Accenture("Ranjeet", "Leadership", 600000, 56780f);
		ac1.login();
	}

}
