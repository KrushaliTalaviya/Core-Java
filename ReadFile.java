package program;

import java.io.File; // Import the file class
import java.io.FileNotFoundException; // Import this class for handling the errors
import java.util.Scanner; // Import scanner for read the data from the file

/**
 * Practical-25 : Write a program to read the data from a myTestFile file (Using
 * File Handling, Input Handling, Loops, String Handling, and Exception
 * Handling).
 * 
 * @author Krushali
 */
public class ReadFile {

	public static void main(String[] args) {
		File readFile;
		Scanner userScanner = null;
		try {
			readFile = new File("myTestFile.txt"); // Initialize the file object

			// Initialize the scanner class for read the data from the file
			userScanner = new Scanner(readFile);

			// Read the data from the file using loop
			while (userScanner.hasNextLine()) {
				String personalDetails = userScanner.nextLine();
				System.out.println(personalDetails);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error Occured"); // Throw exception when error occurred
			System.out.println(e.getMessage()); // Print the error
		}
		finally {
			userScanner.close();
		}
	}

}
