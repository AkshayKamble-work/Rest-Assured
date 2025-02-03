package polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.AnimalSound();
		animal.eatAnimal();
		animal.sleep();
		
		System.out.println();
		Animal cats =new Cat();
		cats.AnimalSound();
		cats.eatAnimal();
		cats.sleep();
		System.out.println();
		
		Animal dogs=new Dog();
		dogs.AnimalSound();
		dogs.eatAnimal();
		dogs.sleep();
	}

}
