package program;

/**
 * Practical no-9 : Create a practical to compare two variables of Wrapper class
 * using Wrapper classes.
 *
 * @author Krushali
 */
public class Wrapperclass {

	public static void main(String[] args) {
		// Take a value in wrapper class for Integer,character
		Integer value1 = Integer.valueOf(100);
		Integer value2 = Integer.valueOf(100);
		String string1 = String.valueOf('J');

		// Declare a variable
		int value3 = 5;
		String string2 = "k";

		System.out.println("Value of Integer Object is: " + value1);
		System.out.println("Value of Character Object is: " + string1);

		// Compare the value of wrapper class
		System.out.println(value1 == value3);
		System.out.println(value1 == value2);
		System.out.println(string1 == string2);
	}

}
