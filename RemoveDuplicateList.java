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
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("A");
		arraylist.add("C");
		arraylist.add("E");
		arraylist.add("E");
		arraylist.add("E");
		System.out.println("Value of the Array is: " + arraylist); // Print the value of the arraylist
		Set<String> set = new HashSet<String>(arraylist); // Convert arraylist into the set
		System.out.println("Now value of set is: " + set); // Now remove the duplicate value
	}

}
