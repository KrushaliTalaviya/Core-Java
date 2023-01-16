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
	int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	// Overloading method for multiplication in integer-double
	double multiplication(int number1, double number2) {
		return number1 * number2;
	}

	// Overloading method for multiplication in double-double
	double multiplication(double number1, double number2) {
		return number1 * number2;
	}
	
}

public class PolymorphismCompile {

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();

		double result = multiplication.multiplication(10, 10);
		System.out.println("Your integer-interger multiplication is: " + result);
		result = multiplication.multiplication(10, 10.5);
		System.out.println("Your integer-double multiplication is: " + result);
		result = multiplication.multiplication(10.5, 10.5);
		System.out.println("Yout double-double multiplication is: " + result);
	}

}
