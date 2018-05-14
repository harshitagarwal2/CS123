import java.io.*;
class Armstrong
{
	public static boolean isArmstrong(int num)
	{
		int copy=num, dig, sum=0;
		while(copy>0)
		{
			dig=copy%10;
			sum+= (int)Math.pow(dig,3);
			copy/=10;
		}
		return sum==num;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("Enter number: ");
		num = Integer.parseInt(br.readLine());
		
		if(isArmstrong(num))
			System.out.println(num+" is an ARMSTRONG number!");
		else
			System.out.println("NOT an armstrong number!");
	}
}
