package program;

import java.util.*;

/**
 * Practical-22 : Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”,
 * ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list
 * 
 * @author Krushali
 */
public class RemoveDuplicateList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("E");
		arrayList.add("E");
		System.out.println("Value of the Array is: " + arrayList); // Print the value of the arrayList
		Set<String> hashSet = new HashSet<String>(arrayList); // Convert arrayList into the set
		System.out.println("Now value of set is: " + hashSet); // Now remove the duplicate value
	}

}
