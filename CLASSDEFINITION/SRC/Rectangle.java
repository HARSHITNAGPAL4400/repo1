import java.util.*;

class Rectangle 
{
	double length;
	double width;
	Rectangle()
	{
		length=0;
		width=0;

	}
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;

	}
	void setdimension(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getlength()
	{
		return length;
	}
	
	public double getwidth()
	{
		return width;
	}
	public double area()
	{
		return length*width;
	}
	public double perimeter()
	{
		return 2*(length*width);
	}
	public void print()
	{
		System.out.print("length-" + length + "\n" + "width-" + width);
	}
}
