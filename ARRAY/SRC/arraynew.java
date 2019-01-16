import java.io.File;
import java.util.Scanner;
class arraynew
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in) ;
		int a[]= new int[10];
		int i;
		int item;
	

		boolean flag=false;
		for(i=0; i<10; i++)
        a[i]=sc.nextInt();
        System.out.print("eneter no");
        item=sc.nextInt();
        for(i=0; i<10; i++)
		{
			if(item==a[i])
			{
				System.out.print("item of index " + i);
		       flag=true;
		       break;	
		    }
             if(flag==false)
             {
             	System.out.print("not in list");

             }
		}
	}
}