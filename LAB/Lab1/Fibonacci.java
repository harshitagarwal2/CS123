import java.io.*;
class Fibonacci
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,a=1,b=1,c=0,cnt=2;
		System.out.print("Enter number of terms: ");
		n = Integer.parseInt(br.readLine());
		
		System.out.print("\nFibonacci Series:\n"+a+", "+b);
		while(++cnt<=n)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(", "+c);
		}
		System.out.println();
	}
}
