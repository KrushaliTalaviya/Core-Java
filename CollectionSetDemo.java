package program;

import java.util.HashSet;

/**
 * Create a set using collection and print
 * 
 * @author Krushali
 */
public class CollectionSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); // Create a HashSet
		hashSet.add("One"); // Add the string value
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");

		// Print the value of hashSet
		System.out.println("Contents is: " + hashSet);
	}

}
