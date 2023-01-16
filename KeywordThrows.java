package program;

/**
 * Practical no-18 : Write a program to handle exceptions using try, catch,
 * Finally, throw, and throws keywords.
 * 
 * Throws keyword
 * 
 * @author Krushali
 */
public class KeywordThrows {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwOne(); // Throws the exception
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}

}
