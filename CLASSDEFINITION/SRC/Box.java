import java.util.*;


class box extends Rectangle 
{
	private double height;
     
     box()
     {
     	super();
        this.height=height;    
     }  
        box(double length, double width,double height)
        {
        	super(length,width);
           this.height=height;
        }
        public void setdimension(double l,double w,double h)
        {
        	
        	super.setdimension(1,w);
        	height=h;
        }

      public double area()
      {
      	return 2*(getlength()*getwidth()+ getlength()*height +getwidth()*height);
      }
      public double volume()
      {
      	return super.area()*height;
      }
      public double getwidth()
      {
      	return width;
      }
       
       public void print()
       {
       	System.out.print("\n box;area=" +area() + "volume=" + volume());
       }

}