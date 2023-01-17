package program;

import java.util.*;

/**
 * Practical - 23 : Write a program to demonstrate comparable and comparator
 * Interface using Comparator interface
 * 
 * @author Krushali
 */
// Create a class Member Which implements Comparator interface
class NameComparator implements Comparator<NameComparator> {

	int rollNo;
	int age;
	String name;

	NameComparator(int rollno, int age, String name) {
		this.rollNo = rollno;
		this.age = age;
		this.name = name;
	}

	public int compare(NameComparator name1, NameComparator name2) {
		return name1.name.compareTo(name2.name);
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<NameComparator> arrayList = new ArrayList<NameComparator>();

		// Creating a list of NameComparator
		arrayList.add(new NameComparator(100, 25, "Nirali"));
		arrayList.add(new NameComparator(120, 32, "Bharatbhai"));
		arrayList.add(new NameComparator(101, 20, "Krushali"));
		System.out.println("Without sorting");

		// Without sorting print the elements
		for (NameComparator arrayValue : arrayList) {
			System.out.println(arrayValue.rollNo + " " + arrayValue.age + " " + arrayValue.name);
		}
		System.out.println("Sorting by name");

		// Sort element using the comparator interface
		Collections.sort(arrayList, new NameComparator(0, 0, null));

		// Print the elements
		for (NameComparator arrayValue : arrayList) {
			System.out.println(arrayValue.rollNo + " " + arrayValue.age + " " + arrayValue.name);
		}
	}

}
