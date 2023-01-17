package program;

/**
 * Practical no - 6 : Write a program to demonstrate the example of a
 * break/Continue. 
 * Skip the number 3 break from the number 8 using break and continue
 *
 * @author Krushali
 */
public class BreakAndContinue {

	public static void main(String[] args) {
		// For loop from 1 to 10
		for (int number = 1; number <= 10; number++) {
			if (number == 3) {
				continue; // Skip the number using continue
			}

			if (number == 8) {
				break; // Break the loop using break
			}
			System.out.println(number);
		}
	}

}
