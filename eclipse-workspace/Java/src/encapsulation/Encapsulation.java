package encapsulation;

public class Encapsulation {
	/*
 Binding the data member of class using private access in single unit is called as Encapsulation
  OR Hiding the data member of class using private access specifier is called Encapsulation

	 */

	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	private int weight;
	private double height;

public static void main(String[] args)
{

	Encapsulation en=new Encapsulation();
	System.out.println("Before setting the value of elements");
	System.out.println(en.getName());
	System.out.println(en.getHeight());
	System.out.println(en.getWeight());
	System.out.println("After setting the value of elements");
	System.out.println("");
	en.setName("Rohit");
	en.setHeight(5.5);
	en.setWeight(65);
	System.out.println("My name is :: "+en.getName());
	System.out.println("My Height is :: "+en.getHeight());
	System.out.println("My Weight is :: "+en.getWeight());
	
}

}
