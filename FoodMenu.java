import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		
		        int price=0, quantity;
		        int choice;
		        boolean flag=false;
		        Scanner s=new Scanner(System.in);
		        System.out.println("1. Makhani Paneer Biryani		200/-");
		        System.out.println("2. Dum Aloo						150/-");
		        System.out.println("3. Chicken Masala 				290/-");
		        System.out.println("4. Chicken DoPyaza				330/-");
		        System.out.println("5. Veg Manchurian				180/-");
		        System.out.println("6. Paneer Crispy				190/-");
		        System.out.println("7. Chicken Manchurian			230/-");
		        System.out.println("8. Chicken Crispy				220/-");
		        System.out.println("9. Fruit Custard				150/-");
		        System.out.println("10.Vanilla Icecream				 90/-");
		        System.out.println("11. Generate Bill");
		        while(flag!=true)
		        {
		            System.out.println("enter your choice");
		            choice=s.nextInt();
		            switch(choice)
		            {
		                case 1: 
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                price=(200*quantity)+price;
		                //System.out.println("result is: "+result);
		                break;

		                case 2: 
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(150*quantity)+price;
		                	break;

		                case 3:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(290*quantity)+price;
		                	break;

		                case 4:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(330*quantity)+price;
		                	break;
		                	
		                case 5:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(180*quantity)+price;
		                	break;
		                case 6:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(190*quantity)+price;
		                	break;
		                case 7:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(230*quantity)+price;
		                	break;
		                case 8:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(220*quantity)+price;
		                	break;
		                case 9:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(150*quantity)+price;
		                	break;
		                case 10:
		                	System.out.println("please enter quantity: ");
		                	quantity=s.nextInt();
		                	price=(90*quantity)+price;
		                	break;
		                	
		                case 11:
		                	flag=true;
		                	System.out.println(price);
		                	break;
		            }
		            
		        }
		            s.close();
		    }
		
	}


