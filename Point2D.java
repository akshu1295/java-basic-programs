package p1;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Point2D {
	private double x, y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void isEqual(double x2, double y2) {
		this.x = x2;
		this.y = y2;
	}

	public String getDetails() {
		return x + " " + y;
	}

	boolean isEqual(Point2D point2) {
		return this.x == point2.x && this.y == point2.y;
	}

	Point2D Offset(double x, double y) {
		Point2D newoff = new Point2D(this.x + x, this.y + y);
		return newoff;
	}

	public double CalDistance(Point2D p2) {
		double dis = Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
		return dis;
	}
	
	public static void Arrays() {
		Scanner s=new Scanner (System.in);
		System.out.println("enter cordinates: ");
		Point2D[] point=new Point2D[s.nextInt()];
		System.out.println("Default Array elements"+Arrays.toString(point));
		for(int i=0;i<point.length;i++) {
			System.out.println("enter cordinate points: x and y");
			point [i]=new Point2D(s.nextDouble(),s.nextDouble());
			
		}
		for (Point2D p: point) {
			System.out.println(p.getDetails());
			System.out.println("distance="+p.isEqual(p));
		}
		System.out.println("Point array"+Arrays.toString(point));
		for (Point2D p: point) {
			System.out.println(p.getDetails());
			System.out.println("distance is "+p.CalDistance(p));
			
		}
	}
	
	
	
	
}