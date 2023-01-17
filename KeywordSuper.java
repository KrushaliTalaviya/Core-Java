package program;

/**
 * Practical no-11 : Write a program to use super keyword
 *
 * @author Krushali
 */
class Animal {

	String value = "Big-dog";

}

class Dog extends Animal {

	String value = "Small-dog";

	void showValue() {
		// Print value using Dog class
		System.out.println("using Child class value of : " + value);

		// Print value using Animal class
		System.out.println("using Parent class using super keyword value is: " + super.value);
	}

}

public class KeywordSuper {

	public static void main(String[] args) {
		Dog dog = new Dog(); // Make a object of child class
		dog.showValue(); // Call the function
	}

}
