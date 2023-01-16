package program;

/**
 * Practical no-15 : Write a program to demonstrate all types of Inheritance
 * Single Inheritance
 *
 * @author Krushali
 */
// Super class
class Mother {

	void mother() {
		System.out.println("I am a mother");
	}

}

// Subclass of superclass
class Daughter extends Mother {

	void daughter() {
		System.out.println("I am a daughter");
	}

}

public class InheritanceSingle {

	public static void main(String[] args) {
		// Create a object of subclass
		Daughter daughter = new Daughter();
		daughter.daughter();
		daughter.mother();
	}

}
