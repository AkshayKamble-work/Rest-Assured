package polymorphism;

public class RuntimePolymorphism 
{
	/*
  Method Deceleration and Definition are binding at the time of JVM biased on input parameter

  its is Dynamic binding and late binding

  object is binding with functionality at runtime
  
  Achieved using method overriding.
  
  Runtime Polymorphism (Method Overriding)
	 */
	public static void main(String[] args) {


		Animals myAnimal;  // Reference of type Animal

		// Dog object
		myAnimal = new Dogs();
		myAnimal.makeSound();  // Calls Dog's makeSound method

		// Cat object
		myAnimal = new Cats();
		myAnimal.makeSound();  // Calls Cat's makeSound method

	}
}
