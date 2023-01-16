package program;

/**
 * Practical no - 14 : Write a program to demonstrate encapsulation
 *
 * @author Krushali
 */
// Encapsulated class Student
class Student {

	// Private data member
	private String name;

	// Get method for name
	public String getname() {
		return name;
	}

	// Set method for name
	public String setname(String name) {
		return this.name = name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// Creating the object of encapsulated class
		Student student = new Student();

		// Setting the value in name member
		student.setname("Vraj");

		// Get value of the name member
		System.out.println("Student name is: " + student.getname());
	}

}
