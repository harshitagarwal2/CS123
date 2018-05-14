class PushException extends Exception
{
	public String toString()
	{
		return "\nStack Overflow";
	}
}

class PopException extends Exception
{
	public String toString()
	{
		return "\nStack Underflow";
	}
}

class StackException
{
	private int top, arr[], n;
	
	StackException(int m)
	{
		top=-1;
		n=m;
		arr=new int[n];
	}
	
	public void push(int x) throws PushException
	{
		if(top==n-1)
			throw new PushException();
		else
			arr[++top]=x;
	}
	
	public int pop() throws PopException
	{
		if(top==-1)
			throw new PopException();
		else
			return arr[top--];
	}
	
	void display()
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+"  ");
	}
}

public class StackExceptionMain
{
	public static void main(String[] args)
	{
		StackException obj=new StackException(3);
		try
		{
			obj.push(1);
			obj.push(2);
			obj.push(3);
			obj.push(4);
		}
		catch(PushException e)
		{
			System.out.println("\nCAUGHT");
		}
		
		try
		{
			System.out.println(obj.pop());
			System.out.println(obj.pop());
			System.out.println(obj.pop());
			System.out.println(obj.pop());
		}
		catch(PopException e2)
		{
			System.out.println("\nGot ya!");
		}
	}
}
