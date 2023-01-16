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
		// declare the variables for loop
		int i, j;

		// Outer loop for rows
		for (i = 1; i <= 5; i++) {
			// Inner loop for columns
			for (j = 1; j <= i; j++) {
				// Print starts
				System.out.print(" * ");
			}
			// Throws the cursor in new line after printing each line
			System.out.print("\n");
		}
	}

}
