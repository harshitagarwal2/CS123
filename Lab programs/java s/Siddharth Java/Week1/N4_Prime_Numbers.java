class N4_Prime_Numbers
{
	public static void main(String args[])
	{
		int l=1;
		int u=100;
		for (int i=l; i<=u; i++)
		{
			int c=0;
			for (int j=2; j<i; j++)
			{					
				if (i%j==0)
				{
					c++;
				}
			}
			if (c==0)
			{
				System.out.println(i);
			}
		}
	}
	
}
