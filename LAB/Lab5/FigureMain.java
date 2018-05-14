import java.util.Scanner;

abstract class Figure
{
	private double d1, d2;
	Figure(double a, double b)
	{
		d1=a;
		d2=b;
	}
	
	double getd1()
	{
		return d1;
	}
	
	double getd2()
	{
		return d2;
	}
	
	abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double l, double b)
	{
		super(l,b);
	}
	
	double area()
	{
		return getd1()*getd2();
	}
}

class Square extends Figure
{
	Square(double l)
	{
		super(l,0);
	}
	
	double area()
	{
		return getd1()*getd1();
	}
}

class Triangle extends Figure
{
	Triangle(double l, double h)
	{
		super(l,h);
	}
	
	double area()
	{
		return 0.5*getd1()*getd2();
	}
}

class FigureMain
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Figure obj;
	double l,b;
	
	System.out.println("\nEnter length of a rectangle: ");
	l = sc.nextInt();
	System.out.println("\nEnter breadth of a rectangle: ");
	b = sc.nextInt();
	obj = new Rectangle(l,b);
	System.out.println("\nArea of the rectangle: "+obj.area());
	
	System.out.println("\nEnter side of a square: ");
	l = sc.nextInt();
	obj = new Square(l);
	System.out.println("\nArea of the square: "+obj.area());
	
	System.out.println("\nEnter length of the triangle: ");
	l = sc.nextInt();
	System.out.println("\nEnter altitude: ");
	b = sc.nextInt();
	obj=new Triangle(l,b);
	System.out.println("\nArea of the triangle: "+obj.area());
	}
}
