package constructor;

public class Constructors {

	String modelName;
	int Modelyear;

	public Constructors(String name, int year)
	{
		modelName=name;
		Modelyear=year;
	}

	/*
	 A constructor in Java is a special method that is used to initialize objects. 
	 The constructor is called when an object of a class is created. 
	 It can be used to set initial values for object attributes

	 */



	public static void main(String[] args) 
	{

		Constructors c=new Constructors("XUV700 ax7L", 2024);
		System.out.println(c.modelName+"  ::" +c.Modelyear);
	}
}
