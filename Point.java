package p1;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter Co-ordinates for point 1( x & y): ");
		Point2D p1 = new Point2D(s.nextDouble(), s.nextDouble());
		System.out.println("cordinates are: " + p1.getDetails());
		
		System.out.println("enter Co-ordinates for point 2( x & y): ");
		Point2D p2 = new Point2D(s.nextDouble(), s.nextDouble());
		if (p1.isEqual(p2))
			System.out.println("same");

		else
			System.out.println("different");
		System.out.println("enter offset for new box: ");
		
		Point2D p3 = p1.Offset(s.nextDouble(), s.nextDouble());
		System.out.println("box after offset is " + p3.getDetails());
		
		double dis = p1.CalDistance(p2);
		System.out.println("distance is : " + dis);
		
		
		s.close();
	}
}