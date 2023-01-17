package program;

import java.util.Scanner;

/**
 * Practical no-3 : Write a program to find the current month name from the
 * given number of the switch case.
 *
 * @author Krushali
 */
public class SwitchCase {

	public static void main(String[] args) {
		// Create an object of Scanner class
		Scanner userScanner = new Scanner(System.in);
		System.out.println("Enter a number From 1 to 12");

		// Take a choice from user between 1 to 12
		int choice = userScanner.nextInt();
		userScanner.close(); // close the scanner class

		// Take a variable for choice value
		String month = "";
		switch (choice) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			default:
				System.out.println("Your choice is Invalid\nPlease Enter a Valid choice");
				return;
		}

		// Print the choice eg. if choice is 1 then return January
		System.out.println("Your Month is " + month);
	}

}