package program;

/**
 * Practical no - 13 :  Write a program to demonstrate data abstraction. using
 * abstract data and abstract method
 *
 * @author Krushali
 */
abstract class AbstractData1 {

	String myName;

	public abstract void setData(); // No method body and abstract

	public void show() {
		System.out.println("My Name is " + myName);
	}

}

class AbstractData2 extends AbstractData1 {
	
	public void setData() {
		myName = "krushali";
	}

}

public class Abstraction {

	public static void main(String[] args) {
		AbstractData2 abstractData = new AbstractData2();
		abstractData.setData(); // Child class set method call
		abstractData.show(); // Call Abstract class method
	}

}
