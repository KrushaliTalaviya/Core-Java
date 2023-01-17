package program;

import java.io.File;
import java.io.IOException; // the IOException class to handle errors
import java.io.FileWriter; //  the FileWriter class

/**
 * Practical-24 : Write a program to create a text file(The file name is
 * “myTestFile”) and add your personal details to the test file.
 * 
 * @author Krushali
 */
public class CreateAndWriteFile {

	public static void main(String[] args) {
		try {
			File createFile = new File("myTestFile.txt"); // Initialize file object and pass file name as argument

			// Create file and check file is successfully created or not
			if (createFile.createNewFile()) {
				System.out.println("File created: " + createFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
		FileWriter addDetails = null;
		try {
			addDetails = new FileWriter("myTestFile.txt");   // Create a FileWriter object
			addDetails.write("Name: Talaviya Krushali Bharatbhai\n"); // To write in the file
			addDetails.write("Email id:krushalitalaviya@gmail.com\n");
			addDetails.write("Phone no:7226050295\n");
			addDetails.write("Address: C-12 Nishant Bunglows,Nikol");

			// Display message for successfully write into file
			System.out.println("Successfully wrote to the file");
			
		} catch (IOException e) {
			System.out.println("An error occurred");
		}
		finally {
			try {
				addDetails.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
