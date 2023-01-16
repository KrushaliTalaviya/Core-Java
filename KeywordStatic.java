package program;

/**
 * Practical no-12 : Write a program to demonstrate static methods, variables,
 * and blocks.
 *
 * @author Krushali
 */
public class KeywordStatic {

	static int marks = 96; // Declare static variable
	static String name = "krushali"; // Declare static string

	// Declare static function
	static void printValue(String sub) {
		System.out.println("Marks is: " + marks);
		System.out.println("Name is: " + name);
		System.out.println("Subject is:" + sub);
	}

	// Static block
	static {
		System.out.println("This is a static block");
	}

	public static void main(String[] args) {
		printValue("maths");
	}

}
