package program;

import java.util.*;

/**
 * Practical-20 : Write a program to add string
 * values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values
 * using an iterator.
 * 
 * @author Krushali
 */
public class ListandIterator {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>(); // ArrayList
		System.out.println("Enter you Name: ");

		// Take a input from the user
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine(); // Input user name
		scanner.close(); // Close the scanner class

		arraylist.add(name); // Add the value in the array
		arraylist.add("Hello");
		arraylist.add("world");
		arraylist.add("Java");

		// Print the value using Iterator
		Iterator<String> array = arraylist.iterator();
		while (array.hasNext()) {
			System.out.println(array.next());
		}
	}

}
