import java.util.Scanner;
public class TestConstructor {
    public static void main(String[] args) {
        // ConstructorDemo c1=new ConstructorDemo(101,"Akshay");
        // System.out.println();
        // ConstructorDemo c2=new ConstructorDemo(102,"Shimpi");
        // System.out.println();
        Scanner s=new Scanner(System.in);

        //ConstructorDemo c3=new ConstructorDemo(s.nextInt(), s.nextLine(),s.nextDouble());
        ConstructorDemo c4=new ConstructorDemo(s.nextDouble());
        //ConstructorDemo c4=new ConstructorDemo();
        //System.out.println("obj1 initilization using constructor is:"+c1.getinfo());
       // System.out.println("obj2 initilization using scanner: "+c3.getinfo());
        System.out.println("obj2 initilization using scanner: "+c4.displaynumber());
        s.close();
    }
}
