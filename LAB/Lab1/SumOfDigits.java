import java.io.*;
class SumOfDigits
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num, copy, sum=0;
		System.out.print("Enter number: ");
		num = Integer.parseInt(br.readLine());
		copy=num;
		while(copy>0)
		{
			sum+=(copy%10);
			copy/=10;
		}
		System.out.println("\nSum: "+sum);
	}
}
