package thisKeyword;

public class Student {

	
	int rollno;  
	String name;  
	float fee; 
	
	public Student(int rollno, String name,float fee)
	{

		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	void display(){System.out.println(rollno+" "+name+" "+fee);
	{
	System.out.println("Displayed Method is Running...!!!");	
	}
	
	
	} 
	
	public static void main(String[] args) {
		
		
		Student s=new Student(5, "Vamsi", 50000f);
		Student s1=new Student(6, "Alekhya", 40000f);
		s.display();
		s1.display();
	}
	
}
