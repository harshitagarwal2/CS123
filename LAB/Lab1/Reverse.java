import java.io.*;
class Reverse
{
	public static int rev(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev = (rev*10) + (n%10);
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Enter number: ");
		num = Integer.parseInt(br.readLine());
		
		reverse = rev(num);
		System.out.println("\nReverse of the number: "+reverse);
		if(reverse==num)
			System.out.println("\nPalindrome!");
		else
			System.out.println("\nNot palindrome");
	}
}
