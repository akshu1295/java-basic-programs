package p1;

import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
//		int no1,no2,sum=0;
//		Scanner s=new Scanner (System.in);
//		System.out.println("enter first number: ");
//		no1=s.nextInt();
//		System.out.println("enter second  number: ");
//		no2=s.nextInt();
//		System.out.println("sum of numbers from "+no1+" to "+no2+" is  : ");
//		for (int i=no1;i<=no2;i++) {
//			sum=sum+i;
//			}
//		System.out.println(sum);
//		s.close();
		int no1=1,no2=10,sum=0;
		Scanner s=new Scanner (System.in);
		
		System.out.println("sum of numbers from "+no1+" to "+no2+" is  : ");
		for (int i=no1;i<=no2;i++) {
			sum=sum+i;
			}
		System.out.println(sum);
		s.close();
	}

}
