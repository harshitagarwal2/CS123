import java.io.*;
class ShowPrimes
{
	public static boolean isPrime(int num) 
	{
		int i;
		for(i=2; i<=num/2; i++)
			if(num%i==0)
				return false;
		return true;
	}
	
	public static void showPrimes(int a, int b)
	{
		int i;  
		for(i=a; i<=b; i++)
			if(isPrime(i))
				System.out.print(i+"  ");		
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int start, end;
		System.out.print("Enter upper limit: ");
		start = Integer.parseInt(br.readLine());
		System.out.print("Enter lower limit: ");
		end = Integer.parseInt(br.readLine());
		System.out.println("\nPrimes in the limit:");
		showPrimes(start,end);
	}
}
