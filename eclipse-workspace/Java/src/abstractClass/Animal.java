package abstractClass;

abstract class Animal {
	
	abstract void makeSound(); // Abstract methods

    // Concrete method
    public void sleep() {
        System.out.println("Sleeping..."); // non abstract method
    }

}
