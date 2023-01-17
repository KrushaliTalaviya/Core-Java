package program;

import java.util.*;

/**
 * Make a list using collection and print
 * 
 * @author Krushali
 */
public class CollectionListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); // ArrayList
		arrayList.add("Mango"); // Add string values
		arrayList.add("Orange");
		arrayList.add("Kiwi");
		arrayList.add("Greps");
		arrayList.add(2, "Apple"); // Add String value at given position

		// Print all values
		System.out.println("List is: " + arrayList);
	}

}
