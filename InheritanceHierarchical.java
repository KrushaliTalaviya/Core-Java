package program;

/**
 * Practical no - 15 : Write a program to demonstrate all types of Inheritance
 * Hierarchical Inheritance
 *
 * @author Krushali
 */
// Create a super class
class ParentClass {

	void parentClass() {
		System.out.println("This is a Parent class");
	}

}

// Create a sub class 1 of super class
class ChildClassFirst extends ParentClass {

	void childClassFirst() {
		System.out.println("This is a child one of parent class");
	}

}

// Create a sub class 2 of super class
class ChildClassSecond extends ParentClass {

	void childClassSecond() {
		System.out.println("This is a child two of parent class");
	}

}
 
public class InheritanceHierarchical {

	public static void main(String[] args) {
		// Create a object of second child class
		ChildClassSecond childClassSecondObject = new ChildClassSecond();
		childClassSecondObject.parentClass(); // Call the parent class method
		childClassSecondObject.childClassSecond(); // Call the second child class method
	}

}
