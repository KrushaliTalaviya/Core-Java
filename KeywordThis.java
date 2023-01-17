package program;

/**
 * Practical no-11 : Write a program to use this keyword
 *
 * @author Krushali
 */
class ThisKeyword {

	// Declare the variable
	int value = 10;

	void showValue() {
		// Using this keyword we can print here value1
		this.value = 100;
		System.out.println("value is: " + value);
	}
	
}

public class KeywordThis {

	public static void main(String[] args) {
		ThisKeyword thisKeyword = new ThisKeyword();
		thisKeyword.showValue(); // Call the function 
	}

}
