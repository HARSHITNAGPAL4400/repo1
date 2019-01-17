class complex 
{
	int real;
	int imaginary;
	//non parameterized constructor
	complex(){}
// parameterized constructor
	complex(int real , int imaginary)
	{  
	   this.real=real;
	   this.imaginary=imaginary;
		
	}
	complex add(complex c)
	{
		complex cadd= new complex();
		cadd.real=real +c.real;
		cadd.imaginary=imaginary +c.imaginary;
		return cadd;
	}

}
    class complexDemo{
	public static void main(String args[])
	{
	complex c1=new complex(1,2);
	complex c2=new complex(3,4);
	complex c3=new complex();
	c3= c1.add(c2);
	System.out.print("c1= "+c1.real + " " + c1.imaginary );
	System.out.print("c2= "+c2.real + " " + c2.imaginary );
	System.out.print("sum= "+c3.real + " " + c3.imaginary );
    }
}