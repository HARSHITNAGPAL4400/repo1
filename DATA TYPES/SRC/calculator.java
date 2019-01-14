//to add,sub,mul,div,mod etc
import java.io.File;
import java.util.Scanner;
class Calculator
{ public static void main(String args[])
  {int add,sub,mul,div,mod,a=3,b=2;
		int c;
		
	add=a+b;
	sub=a-b;
	mul=a*b;
	div=a/b;
	mod=a- div*b;

    System.out.println("Press 1 to add");
	System.out.println("Press 2 to sub");
	System.out.println("Press 3 to mul");
	System.out.println("Press 4 to div");
	System.out.println("Press 5 to mod");

	System.out.println("Enter choice 1 to 5");
	c=Integer.parseInt(System.console().readLine());

	
	switch(c)
		{
			case 1:
			System.out.println("addition is" + (int)add);
			break;

			case 2:
			System.out.println("subtraction is" + (int)sub);
			break;

			case 3:
			System.out.println("multiplication is" + (int)mul);
			break;

			case 4:
			System.out.println("divide is" + (int)div);
			break;

			case 5:
			System.out.println("modulus is" + (int)mod);
			break;
		}


	
  }
}