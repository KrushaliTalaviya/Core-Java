package program;

import java.util.Scanner;

/**
 * Practical no - 2 Write a program to demonstrate the use of if / else
 * statements. Check the age
 *
 * @author Krushali
 */
public class Ifelse {

	public static void main(String[] args) {
		// Scanner class to take user input.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age:");

		// Take a integer age from user
		int age = scanner.nextInt();
		scanner.close(); // close scanner class

		// Check age is greater than 18 or not.
		if (age > 18) {
			System.out.println("Your age is Greater than 18.");
		} else {
			System.out.println("Your age is less than 18.");
		}
	}

}
