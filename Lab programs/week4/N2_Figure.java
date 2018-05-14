abstract class Figure
{
	int a,b;
	abstract void area();
}
class Rectangle extends Figure
{
	void Rectangle (int l,int bb)
	{
		a=l;
		b=bb;
	}
	void area()
	{
		System.out.println("Area: \t\t"+(a*b));
	}
}
class Square extends Figure
{
	void Square (int l)
	{
		a=b=l;
	}
	void area()
	{
		System.out.println("Area: \t\t"+(a*a));
	}
}

class Triangle extends Figure
{
	void Triangle (int al,int bl)
	{
		a=al;
		b=bl;
	}
	void area()
	{
		System.out.println("Area: \t\t"+(0.5*a*b));
	}
}

class N2_Figure
{
	public static void main(String args[])
	{

	Figure refObj;
	Rectangle ob1=new Rectangle();
	ob1.Rectangle(3,4);

	Square ob2=new Square();
	ob2.Square(4);
	
	Triangle ob3=new Triangle();
	ob3.Triangle(3,4);

	refObj=ob1;
	refObj.area();

	refObj=ob2;
	refObj.area();
	
	refObj=ob3;
	refObj.area();
	}
}
