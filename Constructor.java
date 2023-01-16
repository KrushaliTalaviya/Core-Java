package program;

/**
 * Practical no - 7 : Write a program to demonstrate the example of constructor
 * and Parameterized constructor. Pass two integer parameters and apply any
 * mathematical formula
 *
 * @author Krushali
 */
class Sum {
	
	// Create a default constructor
	Sum(){
		System.out.println("Good Morning");
	}
	
	// Create a parameterized constructor
	Sum(int number1, int number2) {
		System.out.println("Sum of two number is: " + ( number1 + number2 ));
	}

}

public class Constructor {

	public static void main(String[] args) {
		Sum firstConstructor = new Sum(); // Create a object of default constructor
		Sum secondConstructor = new Sum(10, 15); // Create a object of parameterized constructor
	}

}
