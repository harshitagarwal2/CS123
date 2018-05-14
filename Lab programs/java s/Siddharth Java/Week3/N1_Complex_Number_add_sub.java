import java.util.*;

class N1_Complex
{
	int a,b;
	
	N1_Complex()
	{
		a=0;
		b=0;
	}

	
	void read()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a: ");
		a=s1.nextInt();
		System.out.println("Enter b: ");
		b=s1.nextInt();
	}

	void display()
	{
		System.out.println("Complex number:");
		if (b>0)
		{
			System.out.println(a+" +i"+b);
		}
		else if (b<0)
		{
			System.out.println(a+" -i"+Math.abs(b));
		}
		else
		{
			System.out.println(a);
		}
	}

	N1_Complex add (N1_Complex obj3)
	{
		N1_Complex obj4=new N1_Complex();
		obj4.a=this.a+obj3.a;
		obj4.b=this.b+obj3.b;
		return obj4;
	}
	
	N1_Complex sub (N1_Complex obj3)
	{
		N1_Complex obj5=new N1_Complex();
		obj5.a=this.a-obj3.a;
		obj5.b=this.b-obj3.b;
		return obj5;
	}
}

class N1_Complex_Number_add_sub
{	
	public static void main (String args[])
		{
			N1_Complex obj1=new N1_Complex();
			N1_Complex obj2=new N1_Complex();
			N1_Complex obj6=new N1_Complex();
			obj1.read();
			obj2.read();
			obj1.display();
			obj2.display();
			obj6=obj1.add(obj2);
			obj6.display();
			obj6=obj1.sub(obj2);
			obj6.display();
		}
}
