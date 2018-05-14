import java.util.Scanner;
class Gen <T,V>
{
	T obj;
	V obj2;
	
	Gen(T o1, V o2)
	{
		obj=o1;
		obj2=o2;
	}
	
	T getObject()
	{
		return obj;
	}
	
	void display()
	{
		System.out.println(obj);
	}
}

public class GenDemo
{
	public static void main(String[] args)
	{
		Gen <Integer, Double> I1 = new Gen <Integer,Double>(100, 12.2);
		I1.display();
	}
}
