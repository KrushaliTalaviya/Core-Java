package program;

import java.util.HashSet;

/**
 * Create a set using collection and print
 * 
 * @author Krushali
 */
public class CollectionSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>(); // Create a HashSet
		hashset.add("One"); // Add the string value
		hashset.add("Two");
		hashset.add("Three");
		hashset.add("Four");
		hashset.add("Five");

		// Print the value of HashSet
		System.out.println("Contents is: " + hashset);
	}

}
