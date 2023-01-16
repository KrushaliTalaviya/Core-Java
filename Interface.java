package program;

/**
 * Practical no-17 : Write a program to demonstrate the interface.
 * 
 * Using Multiple Interface
 * 
 * @author Krushali
 */
// Create a multiple interface
interface Animals {
	// Create a method cat
	void cat();
}

interface Car {
	// Create a method bmw
	void bmw();
}

interface World extends Car, Animals {
	// Create a method earth
	void earth();
}

// Implementation of inheritance methods
class Superclass implements Animals, Car, World {
	
	public void cat() {
		System.out.println("This is a cat");
	}

	public void bmw() {
		System.out.println("This is a BMW");
	}

	public void earth() {
		System.out.println("This is a Earth");
	}

}

public class Interface {

	public static void main(String[] args) {
		// Create a object of class which implement interface
		Superclass superclass = new Superclass();

		// Call the methods
		superclass.cat();
		superclass.bmw();
		superclass.earth();
	}

}
