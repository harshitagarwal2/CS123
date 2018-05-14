import java.util.Scanner;

class Arrays
{
	public static <T> void print(T[] arr)
	{
		for(T x : arr)
			System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		Integer a1[]= {1,2,3,4,5};
		print(a1);
		Character a2[]={'a','b','c'};
		print(a2);
	}
}
