import java.util.*;

class ExceptionExample{
	public static void main(String args[])
	{                                                            //this q is an example of unchecked exception which 
		                                                         //is not checked by compiler
	int a;
	int b;
	int c;
	Scanner sc =new Scanner(System.in);
	System.out.print("\nEnter the value of a");
	a=sc.nextInt();
	System.out.print("\nEnter the value of b");
	try                                         //throws exception
	{
	b=sc.nextInt();
	c=a/b;
    }
    
    catch(ArithmeticException e)               //one catch block per exception
    {
	System.out.print("bye");
    b=1;                              //first subclass(arithamaticexception) will be written after that super class(exception) will be writen
    }
    catch(Exception e)               //one catch block per exception
    {
	System.out.print("hello");
    b=1;
    }

    c=a/b;
	System.out.print("\na ="+a +" b= " +b + " a/b=" +c);

    }
}