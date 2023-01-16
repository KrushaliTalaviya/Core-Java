package program;

/**
 * Practical no - 18 : Write a program to handle exceptions using try, catch,
 * Finally, throw, and throws keywords.
 * 
 * Throw keyword
 * 
 * @author Krushali
 */
public class KeywordThrow {
	
	static void demo() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("caught inside demo");
			throw e; // ReThrow the exception
		}
	}

	public static void main(String[] args) {
		try {
			demo();
		} catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}

}
