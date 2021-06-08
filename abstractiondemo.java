package abstraction;

public class abstractiondemo {

	public static void main(String[] args) {
		
//		X x =new X();//non abstract class object creation possible directly
//		x.m1();
		
//		A a=new A(); class A is abstract so object cannot be created
		D d=new D();// object of D created bcoz A cannot be called directly
		d.m2();
		
//		A b=new D();
//		b.m2();//here ref of classA takes object of D is valid it works same as D d=new D();
	}

}
class X{
//	public X() {
//		System.out.println("construcctor of X ");
//	}
	public void m1() {
		System.out.println("hello non abstract class");
	}
}

abstract class A{
	public A(){
		System.out.println("this is class A abstract class");
	}
	public abstract void m2();
}

class D extends A{
	public void m2() {
		System.out.println("this is m2 body defined in child class as parent is abstract ");
		System.out.println("so implementation body is defined herer");
	}
}