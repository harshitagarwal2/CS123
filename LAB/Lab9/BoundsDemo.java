import java.util.Scanner;
class NumericFun <T extends Number>
{
	T no;
	
	NumericFun(T obj)
	{
		no=obj;
	}
	
	double reciprocal()
	{
		return 1/no.doubleValue();
	}
	
	double fraction()
	{
		return no.doubleValue()-no.intValue();
	}
	
	boolean absEquals(NumericFun <?> n1)
	{
		if(no.doubleValue() == n1.no.doubleValue())
			return true;
		else
			return false;
	}
}

public class BoundsDemo
{
	public static void main(String[] args)
	{
		NumericFun <Integer> obj=new NumericFun<Integer> (2);
		NumericFun <Double> obj2 = new NumericFun <Double> (2.0);
		if(obj.absEquals(obj2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
			
