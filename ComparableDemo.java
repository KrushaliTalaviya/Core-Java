package program;

import java.util.*;

/**
 * Practical - 23 : Write a program to demonstrate comparable and comparator
 * Interface using Comparable interface
 * Take a rollNo, age and name of the member and then sort it by age.
 * 
 * @author Krushali
 */

// Create a class Member Which implements Comparable interface
class Member implements Comparable<Member> {

	int rollNo;
	int age;
	String name;

	Member(int rollNo, int age, String name) {
		this.rollNo = rollNo;
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
		ArrayList<Member> arrayList = new ArrayList<Member>();
		arrayList.add(new Member(1, 28, "Krushali"));
		arrayList.add(new Member(2, 21, "Nirali"));
		arrayList.add(new Member(3, 80, "Bharatbhai"));
		arrayList.add(new Member(4, 45, "Mukeshbhai"));

		Collections.sort(arrayList);
		for (Member member : arrayList) {
			System.out.println(member.rollNo + " " + member.age + "  " + member.name);
		}
	}

}
