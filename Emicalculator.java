package program;

import java.util.Scanner;

/**
 * Practical no - 8 : Apply EMI Calculator in Java - Java program to calculate
 * EMI using Class, Object, Variables, Operators, and DataTypes.
 *
 * @author Krushali
 */
public class Emicalculator {

	public static void main(String[] args) {

		// Scanner class to take user input.
		Scanner scanner = new Scanner(System.in);

		// Take a amount value of amount
		System.out.println("Enter a Principal:");
		double amount = scanner.nextFloat();

		// Take a rate per year
		System.out.println("Enter a rate:");
		double rate = scanner.nextFloat();

		// Take a time in to the year
		System.out.println("Enter a Time in year:");
		double time = scanner.nextFloat();

		// Close scanner class
		scanner.close();
		rate = rate / (12 * 100); /* One month interest */
		time = time * 12; /* One month period */

		double EMI = (amount * rate * Math.pow(rate + 1, time)) / (Math.pow(rate + 1, time) - 1);
		System.out.println("EMI value is: " + EMI);

	}

}
