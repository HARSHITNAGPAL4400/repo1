import java.util.*;

class date
{
	public static void main(String args[])
	{  int date;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
         while(flag)
		try
		{   System.out.print("enter date");
			date=sc.nextInt();
			if(date<1 || date>31)
			throw new Exception("\ninvalid day");
			else 
			{
			System.out.print("\n Entered date =" +date);
			flag=false;
	         }
		}
		catch(Exception e)
		{
			System.out.print("\n" +e.getMessage());   // displays the message written in the exception
		}
	}
}