class N3_Fibonacci
{
	public static void main (String args[])
	{
		int lim=100;
		int n1=0;
		int n2=1;
		System.out.println("Fibonacci series till "+lim+": ");
		System.out.println(n1);
		while (n2<=lim && n1<=lim)
		{	
			n2+=n1;
			if (n2<=lim)
			System.out.println(n2);
			n1+=n2;
			if (n1<=lim)
			System.out.println(n1);
		}
	}
}
		 
