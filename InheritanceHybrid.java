package program;

/**
 * Practical no-15 : Write a program to demonstrate all types of Inheritance
 * Hybrid Inheritance
 *
 * @author Krushali
 */
// Create super class
class GrandFather {

	void showGrandFather() {
		System.out.println("I am GrandFather");
	}

}

// Create a sub class 1 of super class
class Father extends GrandFather {

	void showFather() {
		System.out.println("I am son one");
	}

}

// Create a sub class 2 of super class
class Uncle extends GrandFather {

	void showUncle() {
		System.out.println("I am son two");
	}

}

// Create a sub class of sub class 1
class ChildOfFather extends Father {

	void showChildOfFather() {
		System.out.println("I am daughter of son one");
	}
}

// Create a sub class of sub class 2
class ChildOfUncle extends Uncle {

	void showChildOfUncle() {
		System.out.println("I am Daugher of son two");
	}

}

public class InheritanceHybrid {

	public static void main(String[] args) {
		// Create a object of left side last subclass
		ChildOfFather childOfFather = new ChildOfFather();

		// Create a object of right side last subclass
		ChildOfUncle childOfUncle = new ChildOfUncle();

		childOfFather.showChildOfFather();
		childOfFather.showFather();
		childOfFather.showGrandFather();

		childOfUncle.showChildOfUncle();
		childOfUncle.showUncle();
		childOfUncle.showGrandFather();
	}

}
