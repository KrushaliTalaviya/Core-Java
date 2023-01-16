package program;

/**
 * Practical no-10 : Create programs of all the string methods like charAt(),
 * concat(), equals() etc.
 * tolowerCase(),toupperCase(),trim(),startsWith(),endsWith(),charAt()
 * length(),valueOf(),replace(),concat(),equals()
 *
 * @author Krushali
 */
public class StringMethods {

	public static void main(String[] args) {
		// Declare variable
		String string1 = "  Java  ";
		String string2 = string1.toUpperCase(); // Convert UpperCase
		System.out.println("In uppercase: " + string2);

		// Convert upperCase to lowerCase
		string1 = string2.toLowerCase();
		System.out.println("In lowercase: " + string1);

		// Trim in strring1
		string1 = string1.trim();
		System.out.println("Using trim method:" + string1);

		// StartsWith string method
		System.out.println(string1.startsWith("Ja"));
		System.out.println(string1.startsWith("ja"));

		// EndsWith string method
		System.out.println(string1.endsWith("va"));
		System.out.println(string1.endsWith("VAS"));

		// CharAt() string method in java which find the number in the given position
		System.out.println("In 2nd position: " + string1.charAt(2));

		// Length of string
		System.out.println("Length of string is: " + string1.length());

		// ValueOf string method
		int value = 10;
		String string3 = String.valueOf(value);
		System.out.println(string3 + 10);

		// Replace string method
		string1 = string1.replace("java", "Core-java");
		System.out.println("java is replace with Core-java: " + string1);

		// Concat() string method
		string1 = string1.concat(string3);
		System.out.println(string1);

		// Equals string method
		System.out.println(string1.equals(string3));
	}

}
