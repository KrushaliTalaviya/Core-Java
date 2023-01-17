package program;

/**
 * Practical no-16 : Write a program to demonstrate two types of polymorphism
 * Like compile-time and runtime polymorphism
 * 
 * Compile-time polymorphism(overloading)
 * 
 * @author Krushali
 */
class Multiplication {

	// Create a method for multiplication in integer
	int multiply(int number1, int number2) {
		return number1 * number2;
	}

	// Overloading method for multiplication in integer-double
	double multiply(int number1, double number2) {
		return number1 * number2;
	}

	// Overloading method for multiplication in double-double
	double multiply(double number1, double number2) {
		return number1 * number2;
	}

}

public class PolymorphismCompileTime {

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();

		double result = multiplication.multiply(10, 10);
		System.out.println("Your integer-interger multiplication is: " + result);
		result = multiplication.multiply(10, 10.5);
		System.out.println("Your integer-double multiplication is: " + result);
		result = multiplication.multiply(10.5, 10.5);
		System.out.println("Your double-double multiplication is: " + result);
	}

}
