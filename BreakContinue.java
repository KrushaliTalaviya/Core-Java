package program;

/**
 * Practical no - 6 : Write a program to demonstrate the example of a
 * break/Continue. skip the number 3 break from the number 8
 *
 * @author Krushali
 */
public class BreakContinue {

	public static void main(String[] args) {
		// Take a variable number
		int number;

		// For loop from 1 to 10
		for (number = 1; number <= 10; number++) {
			if (number == 3) { // Skip the number using continue
				continue;
			}

			if (number == 8) { // Break the loop using break
				break;
			}
			System.out.println(number);
		}
	}

}
