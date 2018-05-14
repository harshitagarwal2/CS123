import java.io.*;
class CheckPrime
{
	public static boolean isPrime(int num)
	{
		int i;
		for(i=2; i<=num/2; i++)
			if(num%i==0)
				return false;
		return true;
	}	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Enter number: ");
		num = Integer.parseInt(br.readLine());
		if(isPrime(num))
			System.out.println("Prime number!");
		else
			System.out.println("Not prime");
	}
}
