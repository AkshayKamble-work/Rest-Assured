package polymorphism;

public class Dogs extends Animals
{

	 // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
