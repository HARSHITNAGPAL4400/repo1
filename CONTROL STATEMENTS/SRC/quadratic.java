 import java.io.File;
 import java.lang.Math;
class quadratic
{ 
public static void main(String args[])
    {int a,b,c;
    double r1,r2;
System.out.println("enter coefficient of x^2 that is a");
System.out.println("enter coefficient of x that is b");
System.out.println("enter constant that is c");
a=Integer.parseInt(System.console().readLine());
b=Integer.parseInt(System.console().readLine());
c=Integer.parseInt(System.console().readLine());
double root = Math.sqrt(b*b-4*a*c);
r1=(-b+root)/2*a;
r2=(-b-root)/2*a;
System.out.print("roots of equation are" + r1 + "and" + r2);
    }
}
