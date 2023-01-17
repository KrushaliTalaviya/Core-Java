package program;

import java.util.*;

/**
 * Practical-20 : Write a program to add string
 * values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values
 * using an iterator.
 * 
 * @author Krushali
 */
public class ListAndIterator {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); // ArrayList
		System.out.println("Enter you Name: ");

		// Take a input from the user
		Scanner userScanner = new Scanner(System.in);
		String name = userScanner.nextLine(); // Input user name
		userScanner.close(); // Close the scanner class

		arrayList.add(name); // Add the value in the array
		arrayList.add("Hello");
		arrayList.add("world");
		arrayList.add("Java");

		// Print the value using Iterator
		Iterator<String> array = arrayList.iterator();
		while (array.hasNext()) {
			System.out.println(array.next());
		}
	}

}
