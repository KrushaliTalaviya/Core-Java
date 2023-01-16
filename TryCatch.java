package program;

/**
 * Practical no-18 : Write a program to handle exceptions using try, catch,
 * finally, throw, and throws keywords.
 * 
 * Using Try-Catch
 * 
 * @author Krushali
 */
public class TryCatch {

	public static void main(String[] args) {
		try { // Below code throw the exception
			int data = 50 / 0;
			System.out.println(data);
		} catch (Exception e) { // Catch will be executed
			System.out.println(e);
		}
	}

}
