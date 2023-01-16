package program;

/**
 * Practical no-18 : Write a program to handle exceptions using try, catch,
 * finally, throw, and throws keywords.
 * 
 * Using Try-Catch-Finally
 * 
 * @author Krushali
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		// Below code throw the exception
		try {
			int data = 50 / 0;
			System.out.println(data);
		} catch (Exception e) { // Catch block will be executed
			System.out.println(e);
		} finally { // Finally block will be always executed if exception occurs or not
			System.out.println("This code is executed");
		}
	}

}
