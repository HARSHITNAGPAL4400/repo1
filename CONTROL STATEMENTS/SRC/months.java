import java.util.Scanner;   

class months

{
	public static void main (String args[])

	{ int choice;
	   
	   do
	   {

	   Scanner input = new Scanner(System.in);
       System.out.println("enter month between 1 and 12 ");
       int m = input.nextInt();
       if (m==1)
       	System.out.println("January");
       else if (m==2)
       System.out.println("February");
       else if (m==3)
       	System.out.println("March");
       else if (m==4)
       	System.out.println("April");
       else if (m==5)
       	System.out.println("May");
       else if (m==6)
       	System.out.println("June");
       else if (m==7)
       	System.out.println("July");
       else if (m==8)
       	System.out.println("August");
       else if (m==9)
       	System.out.println("September");
       else if (m==10)
       	System.out.println("October");
       else if (m==11)
       	System.out.println("November");
       else if (m==12)
       	System.out.println("December");
       else  
       	System.out.println("INVALID");

       System.out.println("press 5 to continue ");
       
       choice =input.nextInt();
      } while(choice==5);

    }  
}