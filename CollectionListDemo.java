package program;

import java.util.*;

/**
 * Make a list using collection and print
 * 
 * @author Krushali
 */
public class CollectionListDemo {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>(); // ArrayList
		arraylist.add("Mango"); // Add string values
		arraylist.add("Orange");
		arraylist.add("Kiwi");
		arraylist.add("Greps");
		arraylist.add(2, "Apple"); // Add String value at given position

		// Print all values
		System.out.println("List is: " + arraylist);
	}

}
