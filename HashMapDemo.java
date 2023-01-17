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
		HashMap<String, String> hashMap = new HashMap<String, String>();

		// Add the value in HashMap
		hashMap.put("FirstName", "Krushali");
		hashMap.put("LastName", "Bharatbhai");
		hashMap.put("Enrollment", "200120116002");

		// Print the value
		System.out.println("Now value is: " + hashMap);

		Set<?> set = hashMap.entrySet(); // Convert into set

		Iterator<?> iteration = set.iterator();
		while (iteration.hasNext()) {
			Map.Entry studentEntry = (Map.Entry) iteration.next(); // Convert in Map.entry
			System.out.println("Key is: " + studentEntry.getKey());
			System.out.println("Value is: " + studentEntry.getValue());
			System.out.println();
		}
	}

}
