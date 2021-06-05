package src;

import java.util.Arrays;
import java.util.Scanner;

public class PersonArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number of people to add: ");
		Person[] p=new Person[sc.nextInt()];
		//System.out.println("def values are: "+Arrays.toString(p));
		for (int i=0;i<p.length;i++) {
			System.out.println("enter details First name & last name: ");
			p[i]=new Person(sc.next(),sc.next());
		}
		for (Person p1: p) {
			System.out.println(" "+p1.getDetails());
			
		}
	}

}
