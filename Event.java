package src;

import java.util.Scanner;

public class Event {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter first name and last name:");
		Person p=new Person(s.next(),s.next());
		

		System.out.println("enter details of students roll,fees,grad year,marks,course");
		Student s1=new Student(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.next());
		//Student s1=new Student();
		///System.out.println("details of students roll,fees,grad year,marks,course are:"+s1.getDeatils(s.next(),
				//s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.next()));
		System.out.println("name is: "+p.getDetails());
		System.out.println(s1);
	}

}
