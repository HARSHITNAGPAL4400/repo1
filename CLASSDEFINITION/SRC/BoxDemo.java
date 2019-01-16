import java.io.File;
import java.util.*;

class Box
{
	double width;
	double height;
	double depth;
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
		Box v= new Box();
	    v.setDim();
	    System.out.print(" volume is" + v.volume());


	}
}