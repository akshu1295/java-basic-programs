package p1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPoint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of points: ");
		Point2D[] point = new Point2D[s.nextInt()];
		System.out.println("Default Array elements" + Arrays.toString(point));
		for (int i = 0; i < point.length; i++) {
			System.out.println("enter cordinate points: x and y");
			point[i] = new Point2D(s.nextDouble(), s.nextDouble());

		}
		for (Point2D p : point) {
			System.out.println(p.getDetails());
			System.out.println("distance=" + p.isEqual(p));
		}
		System.out.println("Point array" + Arrays.toString(point));
		for (Point2D p : point) {
			System.out.println(p.getDetails());
			System.out.println("distance is " + p.CalDistance(p));

		}

		s.close();
	}

}
