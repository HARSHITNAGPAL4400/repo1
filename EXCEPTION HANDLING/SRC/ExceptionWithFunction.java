import java.util.*;
class ExceptionWithFunction{
	 static void abc() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		
		
			int a;
			int b;
			int c;
			int[] d={2};
			Scanner sc=new Scanner(System.in);
		
			System.out.print("enter a");
			a=sc.nextInt();
		    System.out.print("enter b");
			 b=sc.nextInt();
			 c=a/b;
			 System.out.print("\na ="+a +" b= " +b + " c=" +c);
			 d[7]=6;
			}
			public static void  main(String args[])
			{
			 try{
			 	
			 	abc();
			 }
			

		
		catch(ArithmeticException e){
			System.out.print("\nArithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e){           //camel case class each letter stat from capital letter
			System.out.print("Array bounds Exception");
		}
		System.out.print("after try/catch blocks");
	}
}
