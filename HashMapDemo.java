package program;

import java.util.*;

/**
 * Practical No - 21 : This is program use HashMap - put Key and Value
 * 
 * @author Krushali
 */
public class HashMapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<String, String> student = new HashMap<String, String>();

		// Add the value in HashMap
		student.put("FirstName", "Krushali");
		student.put("LastName", "Bharatbhai");
		student.put("Enrollment", "200120116002");

		// Print the value
		System.out.println("Now value is: " + student);

		Set<?> set = student.entrySet(); // Convert into set

		Iterator<?> iteration = set.iterator();
		while (iteration.hasNext()) {
			Map.Entry studententry = (Map.Entry) iteration.next(); // Convert in Map.entry
			System.out.println("Key is: " + studententry.getKey());
			System.out.println("Value is: " + studententry.getValue());
			System.out.println();
		}
	}

}
