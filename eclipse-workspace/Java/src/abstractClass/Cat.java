package abstractClass;

public class Cat extends Animal {

	@Override
	void makeSound() {
		System.out.println("Meow! Meow!");
	}

	
	public static void main(String[] args) {
		
		
		// Create objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the abstract method
        myDog.makeSound();
        myCat.makeSound();

        // Call the concrete method
        myDog.sleep();
        myCat.sleep();
	}
}
