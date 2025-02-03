package encapsulation;

public class Accenture 
{

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getEmpCode() {
		return EmpCode;
	}
	public void setEmpCode(double empCode) {
		EmpCode = empCode;
	}
	public String getProfile() {
		return Profile;
	}
	public void setProfile(String profile) {
		Profile = profile;
	}
	public double getShiftTime() {
		return shiftTime;
	}
	public void setShiftTime(double shiftTime) {
		this.shiftTime = shiftTime;
	}
	private	String Name;
	private double Salary;
	private double EmpCode;
	private String Profile;
	private double shiftTime;
	
	public static void main(String[] args) 
	{
	Accenture ac=new Accenture();
	ac.setName("Akshay");
	ac.setEmpCode(1993);
	ac.setSalary(83000);
	ac.setProfile("Senior Software Engineer");
	ac.setShiftTime(9.5);
	
	System.out.println("Employe name is :: "+ac.getName());
	System.out.println("Employe Code is :: "+ac.getEmpCode());
	System.out.println("Employe Salary is :: "+ac.getSalary());
	System.out.println("Employe shit time is :: "+ac.getShiftTime());
	System.out.println("Employe Profile is :: "+ac.getProfile());
		
	}
	
}
