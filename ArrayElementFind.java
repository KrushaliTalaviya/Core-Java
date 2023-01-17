package program;

/**
 * Practical no - 19 : Write a program to find the index of an array element.
 * 
 * @author Krushali
 */

public class ArrayElementFind {

	// Serching method in the array
	public static int arrayFindElement(int array[], int t) {
		if (array == null) { // If array is null
			return -1;
		}

		// Find the length of array
		int lengthOfArray = array.length;
		int i = 0;

		// Serching in the array
		while (i < lengthOfArray) {
			// If i element is equal to find number then return i
			if (array[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 8, 9 };
		// Find the index of 8
		System.out.println("Index position of 8 is: " + arrayFindElement(array, 8));
	}

}
