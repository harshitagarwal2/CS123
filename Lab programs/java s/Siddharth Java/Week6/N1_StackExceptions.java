import java.io.*;

class MyException extends Exception
{
	String st=new String();
	MyException(String str)
	{
		st=str;
	}
	public String toString()
	{
		return st;
	}
}

class N1_StackExceptions
{
	int arr1[];
	int top;
	int maxsize;
	N1_StackExceptions(int m)
	{
		top=-1;
		maxsize=m;
		arr1=new int[maxsize];
	}
	void push(int a) throws MyException
	{
		if (top==(maxsize-1))
		{
			throw new MyException("Stack full");
		}
		else if (top<maxsize)
		{
			top++;
			arr1[top]=a;
		}
	}
	
	void display()
	{
		for (int i=0; i<maxsize; i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	void pop() throws MyException
	{
		if (top<0)
		{
			throw new MyException("Stack empty");
		}
		else if (top<maxsize)
		{
			System.out.println(arr1[top]);
			top--;
		}
	}
}

class N1_StackMain
{
	public static void main(String args[]) throws IOException
	{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader (isr);
	System.out.println("Enter size of stack:");
	int s;
	s=Integer.parseInt(br.readLine());
	N1_StackExceptions obj=new N1_StackExceptions(s);
	int sw=0;
	while (sw!=3)
	{
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Exit");
		System.out.println("Enter your choice: ");
		sw=Integer.parseInt(br.readLine());
	switch (sw)
	{
		case 1:
		int g;
		System.out.println("Enter element to push: ");
		g=Integer.parseInt(br.readLine());
		try
		{
			obj.push(g);
		}
		catch (MyException e)
		{
			System.out.println("Exception caught: "+e);
		}
		break;
		
		case 2:
		try
		{
			obj.pop();
		}
		catch (MyException e2)
		{
			System.out.println("Exception caught: "+e2);
		}
		break;
		
		case 3:
		System.out.println("Exit");
	}
	}
}
}
