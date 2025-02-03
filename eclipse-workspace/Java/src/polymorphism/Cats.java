package polymorphism;

public class Cats extends Animals
{

	
	 // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow Meow !!!");
    }
}
