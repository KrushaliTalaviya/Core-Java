package program;

import java.util.*;

/**
 * Practical - 23 : Write a program to demonstrate comparable and comparator
 * interface using Comparable interface
 * 
 * @author Krushali
 */

// Create a class Member Which implements Comparable interface
class Member implements Comparable<Member> {

	int rollNo;
	int age;
	String name;

	Member(int rollno, int age, String name) {
		this.rollNo = rollno;
		this.name = name;
		this.age = age;
	}

	// Compare ages
	public int compareTo(Member member) {
		if (age == member.age) {
			return 0;
		} else if (age > member.age) {
			return 1;
		} else {
			return -1;
		}
	}

}
// Creating the MemberDetails class  to sort by Age
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Member> arraylist = new ArrayList<Member>();
		arraylist.add(new Member(1, 28, "Krushali"));
		arraylist.add(new Member(2, 21, "Nirali"));
		arraylist.add(new Member(3, 80, "Bharatbhai"));
		arraylist.add(new Member(4, 45, "Mukeshbhai"));

		Collections.sort(arraylist);
		for (Member member : arraylist) {
			System.out.println(member.rollNo + " " + member.age + "  " + member.name);
		}
	}

}
