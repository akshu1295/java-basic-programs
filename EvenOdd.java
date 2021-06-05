package p1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int no1,no2;
		Scanner s=new Scanner (System.in);
		System.out.println("enter first number: ");
		no1=s.nextInt();
		System.out.println("enter second  number: ");
		no2=s.nextInt();
		System.out.println("even numbers for given range are ");
		for (int i=no1;i<=no2;i++) {
			if (i%2==0) {	
				System.out.println(i);
			}
			
			}
		System.out.println("odd numbers for given range are ");
		for (int i=no1;i<=no2;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		
		s.close();

	}

}
