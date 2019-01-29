import java.util.*;

class ExceptionExample0{
	public static void main(String args[])
	{
	int a;
	int b;
	int c;
	Scanner sc =new Scanner(System.in);
	System.out.print("\nEnter the value of a");
	a=sc.nextInt();
	System.out.print("\nEnter the value of b");
	b=sc.nextInt();
	c=a/b;
	System.out.print("\na ="+a +" b= " +b + " a/b=" +c);

    }
}