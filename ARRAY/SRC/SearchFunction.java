import java.util.*; 

class SearchFunction
{
  public static void main(String args[]) 
  {
    
    
     int s,i,item;
     int []a = new int[10];
     Scanner consoleInput = new Scanner(System.in);
      System.out.println("enter elements of the array" );
     
     for(i=0;i<a.length;i++)
     {
     	a[i] = consoleInput.nextInt();

     }    
      
     		System.out.println(" enter the item to search ");
     		
     		item= consoleInput.nextInt();
            if(item==-1)
                System.out.println(" item not in list");
            else
                System.out.println(" item at location " + item);
           s = search(a,item);
       }
            
           static int search(int []a,int item)
            {
                int i;
                for(i=0;i<a.length;i++)
                    {if(item==a[i])
                        return i;}
                        return -1;

     	
     }
 }