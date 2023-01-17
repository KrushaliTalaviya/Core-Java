package program;

/**
 * Practical no - 13 : Write a program to demonstrate data abstraction. using
 * abstract data and abstract method 
 * Abstract class extends child to compulsory override method
 *
 * @author Krushali
 */
abstract class AbstractData1 {

	String myName;

	public abstract void setName(); // No method body and abstract

	// Method for show the name
	public void showName() {
		System.out.println("My Name is " + myName);
	}

}

class AbstractData2 extends AbstractData1 {

	// Method for set the name
	public void setName() {
		myName = "krushali";
	}

}

public class AbstractionDemo {

	public static void main(String[] args) {
		AbstractData2 abstractData = new AbstractData2();
		abstractData.setName(); // Child class set method call
		abstractData.showName(); // Call Abstract class method
	}

}
