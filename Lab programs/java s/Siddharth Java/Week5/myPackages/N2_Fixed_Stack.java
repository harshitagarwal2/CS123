import java.io.*;

interface a
{
	public int push(int arr[], int x) throws IOException;
	public int pop(int arr[], int x);
}

class N2_Fixed_Stack implements a
{
	public int push(int a[], int x) throws IOException
	{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader (isr);
		if (x==a.length-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			System.out.println("Enter a number: ");
			a[++x]=Integer.parseInt(br.readLine());
		}
		return x;
	}
	
	public int pop(int a[], int x)
	{
		if (x<0)
		{
			System.out.println("Stack underflow");

		}
		else
		{
			System.out.println("Pop: "+a[x]);
			x--;
		}
		return x;
	}
}
