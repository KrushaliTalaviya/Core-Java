package program;

import java.util.*;

/**
 * Practical No : 21 This is program use Hashset - add the value and remove get
 * HashSet size and value of HashSet
 * 
 * @author Krushali
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); // Create a HashSet

		System.out.println("Member default set size is: " + hashSet.size()); // HashSet size
		System.out.println("Member default value is: " + hashSet); // HashSet Value
		hashSet.add("Krushali"); // Add the value in set
		hashSet.add("Bharatbhai");
		hashSet.add("Talaviya");
		hashSet.add("100");

		System.out.println("Now member set size is: " + hashSet.size()); // HashSet size after the add value
		System.out.println("Now member valus is: " + hashSet); // Value of HashSet

		hashSet.remove("100"); // Remove value

		System.out.println("Now member set size is: " + hashSet.size());

		Iterator<String> hashSetIteration = hashSet.iterator(); // Print the value using Iterator
		while (hashSetIteration.hasNext()) {
			System.out.println(hashSetIteration.next());
		}
	}

}
