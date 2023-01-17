package program;

/**
 * Practical no-15 : Write a program to demonstrate all types of Inheritance
 * Multilevel Inheritance
 *
 * @author Krushali
 */
// Create a super class
class GreatGrandFather {

	void showGreatGrandFather() {
		System.out.println("I am GreatGrandFather");
	}

}

// Create a subclass one of super class
class SonOfGreatGrandFather extends GreatGrandFather {

	void showGrandFather() {
		System.out.println("I am GrandFather");
	}

}

// Create a subclass of subclass one
class SonOfGrandFather extends SonOfGreatGrandFather {

	void showFather() {
		System.out.println("I am Father");
	}

}

public class InheritanceMultileval {

	public static void main(String[] args) {
		SonOfGrandFather sonOfGrandFather = new SonOfGrandFather();
		sonOfGrandFather.showFather();
		sonOfGrandFather.showGrandFather();
		sonOfGrandFather.showGreatGrandFather();
	}

}
