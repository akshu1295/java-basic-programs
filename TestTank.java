package p1;

//import java.util.Scanner;

public class TestTank {
	public static void main(String[] args) {

		Tank t1 = new Tank(10);
		Tank t2 = new Tank(20);
		System.out.print("1: Tank 1 level: " + t1.getLevel());
		System.out.println(" Tank 2 level: " + t2.getLevel());

		t1.setLevel(t2.getLevel());

		System.out.print("2: Tank 1 level: " + t1.getLevel());
		System.out.println(" Tank 2 level: " + t2.getLevel());

		t1.setLevel(27);
		System.out.print("3: Tank 1 level: " + t1.getLevel());
		System.out.println(" Tank 2 level: " + t2.getLevel());

		t2.setLevel(t1.getLevel() + 10);
		System.out.print("4: Tank 1 level: " + t1.getLevel());
		System.out.println(" Tank 2 level: " + t2.getLevel());
//		Scanner s = new Scanner(System.in);
		// System.out.println("Enter level of respective tanks: ");

//		Tank t3 = new Tank(s.nextInt());
//		System.out.println("enter tank1 level" + t3.getLevel());
//		s.close();
	}

}
