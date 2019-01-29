import java.util.*;
class MultiCatch{
	public static void main(String args[])
	{
		try
		{
			int a;
			int b;
			int c;
			int[] d={2};
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.print("\na=" +a);
			b=sc.nextInt();
			 System.out.print("\nb=" +b);
			 c=a/b;
			 d[2]=99;

		}
		catch(ArithmeticException e){
			System.out.print("divide by 0:" +e);
		}
		catch(ArrayIndexOutOfBoundsException e){           //camel case class each letter stat from capital letter
			System.out.print("Array index oob:" +e);
		}
		System.out.print("after try/catch blocks");
	}
}