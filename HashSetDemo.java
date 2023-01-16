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
		HashSet<String> member = new HashSet<String>(); // Create a HashSet

		System.out.println("Member default set size is: " + member.size()); // HashSet size
		System.out.println("Member default value is: " + member); // HashSet Value
		member.add("Krushali"); // Add the value in set
		member.add("Bharatbhai");
		member.add("Talaviya");
		member.add("100");

		System.out.println("Now member set size is: " + member.size()); // HashSet size after the add value
		System.out.println("Now member valus is: " + member); // Value of HashSet

		member.remove("100"); // Remove value

		System.out.println("Now member set size is: " + member.size());

		Iterator<String> memberIteration = member.iterator(); // Print the value using Iterator
		while (memberIteration.hasNext()) {
			System.out.println(memberIteration.next());
		}
	}

}
