class Circle
{   
	double radius;
	double findArea()
	{
		return radius*radius*3.141;
	}


     void displayArea()
     {
     	System.out.print("Area =" + findArea());
     }
}	

class CircleDemo
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.radius= 5;  
		c.displayArea();


	}
}			 