package program;

/**
 * Practical no-16 : Write a program to demonstrate two types of polymorphism
 * Like compile-time and runtime polymorphism
 * 
 * Runtime polymorphism(overriding)
 * 
 * @author Krushali
 */
// Create a parent class
class Shape {

	void draw() {
		System.out.println("This is a drawing");
	}

}

// Create a child class 1
class Circle extends Shape {

	void draw() {
		System.out.println("This is  drawing a Cirlce");
	}

}

// Create a child class 2
class Rectangle1 extends Shape {

	void draw() {
		System.out.println("This is  drawing a Rectangle");
	}

}

public class PolymorphismRuntime {

	public static void main(String[] args) {
		Shape shape = new Circle(); // Create a object of class circle
		shape.draw();
		shape = new Rectangle1(); // Create a object of class rectangle1
		shape.draw();
	}
	
}
