import java.io.File;
import java.util.*;

class Box1
{
	double width;
	double height;
	double depth;
	Box1()
	{   width =5;
		height =5;
		depth =5;

	}

   Box1 (double width, double height, double depth)
   {
   	this.width=width;
   	this.height=height;
   	this.depth=depth;
   }
		
	void setDim()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter width");
        width=sc.nextDouble();
        System.out.print(" enter height");
        height=sc.nextDouble();
        System.out.print(" enter depth");
        depth=sc.nextDouble();
	}
	double volume(){
		return width * height * depth;
	}
	

}
class BoxDemo
{
	public static void main(String[] args)
	{
		Box1 v= new Box1();
	    v.setDim();
	    System.out.print(" volume is" + v.volume());


	}
}