package p1;

import java.util.Scanner;

public class PrintNo {

	public static void main(String[] args) {
		
		int no1,no2;
		Scanner s=new Scanner (System.in);
		System.out.println("enter first number: ");
		no1=s.nextInt();
		System.out.println("enter second  number: ");
		no2=s.nextInt();
		System.out.println("numbers in the given range are : ");
		for (int i=no1;i>=no2;i--) {
			System.out.println(i);
		}
		s.close();
	}

}







