package program;

/**
 * Practical no-11 : Write a program to use super keyword
 *
 * @author Krushali
 */
class Animal {

	String value = "Big-cat";

}

class Dog extends Animal {

	String value = "Small-cat";

	void show() {
		// Print value using Dog class
		System.out.println("using Child class value of : " + value);

		// Print value using Animal class
		System.out.println("using Parent class using super keyword value is: " + super.value);
	}

}

public class KeywordSuper {

	public static void main(String[] args) {
		Dog dog1 = new Dog(); // Make a object of child class
		dog1.show(); // Call the function
	}

}
