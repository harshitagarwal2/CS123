class N2_Factorial
{
	public static void main(String args[])
		{
			int n=5;
			int sum=1;
			for (int i=1; i<=n; i++)
			{
				sum*=i;
			}
			System.out.println("Factorial of "+n+" = "+sum);
		}
}
