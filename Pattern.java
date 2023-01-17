package program;

/**
 * Practical no-5 : Write a program to demonstrate the example of the ‘for’ loop.
 * Print the following pattern.
 * *
 * **
 * ***
 * ****
 * *****
 *
 * @author Krushali
 */
public class Pattern {

	public static void main(String[] args) {
		// Outer loop for rows
		for (int i = 1; i <= 5; i++) {
			// Inner loop for columns
			for (int j = 1; j <= i; j++) {
				System.out.print(" * "); // Print star
			}
			// Throws the cursor in new line after printing each line
			System.out.print("\n");
		}
	}

}
