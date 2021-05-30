import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Double avg,num1,num2;
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number: ");
        num1=s.nextDouble();
        
        System.out.println("enter second number: ");
        
        if (s.hasNextDouble()){
        	num2=s.nextDouble();
        	avg=((num1+num2)/2);
            System.out.println("Average of entered numbers is: "+ avg);
        }
        else{
        System.out.println("plz enter valid number of double type!");	
        }
        s.close();
    }
}
