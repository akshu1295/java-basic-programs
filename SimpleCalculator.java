import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        double num1,num2,result=0;
        int choice;
        boolean flag=false;
        Scanner s=new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        while(flag!=true)
        {
            System.out.println("enter your choice");
            choice=s.nextInt();
            System.out.println("enter first number: ");
            num1=s.nextDouble();
            System.out.println("enter second number: ");
            num2=s.nextDouble();
            switch(choice)
            {
                case 1: 
                result=num1+num2;
                System.out.println("result is: "+result);
                break;

                case 2: 
                result=num1-num2;
                System.out.println("result is: "+result);
                break;

                case 3:
                result=num1*num2;
                System.out.println("result is: "+result);
                break;

                case 4:
                if (num2==0){
                System.out.println("divide by zero error");
                }
                else
                {
                result=num1/num2;
                System.out.println("result is: "+result);
                }
                break;
                
                case 5:
                flag=true;
                break;
                
                case 6:
                default:
                System.out.println("enter valid choice!");
                break;

            }
            
        }
            s.close();
    }
}