import java.io.*;
class Factorial
{
	public static int fact(int num)
	{
		int i,fact=1;
		for(i=1; i<=num; i++)
			fact*=i;
		return fact;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Enter number: ");
		num = Integer.parseInt(br.readLine());
		System.out.println("\nFactorial : "+fact(num));
	}
}
