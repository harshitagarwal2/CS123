import java.util.Scanner;

interface stack
{
	public void push(int a);
	public int pop();
	public void display();
}

class FixedStack implements stack
{
	private int top, max;
	private int a[];
	
	FixedStack(int maxsize)
	{
		max=maxsize;
		top=-1;
		a=new int [max];
	}
	
	public void push(int x)
	{
		if(top==max-1)
			System.out.println("\nStack overflow!");
		else
		{
			System.out.println("Element inputted successfully!"); 
			a[++top]=x;
		}
	}
	
	public int pop()
	{
		return top==-1 ? -99 : a[top--];
	}
	
	public void display()
	{
		System.out.println("\nThe Stack: ");
		for(int i=0; i<=top; i++)
			System.out.print(a[i]+"  ");
	}
}

class DStack implements stack
{
	private int top, max;
	private int a[];
	
	DStack(int m)
	{
		top=-1;
		max=m;
		a=new int [m];
	}
	
	public void push(int x)
	{
		if(top==max-1)
		{
			int b[]=new int[2*max],i;
			for(i=0; i<max; i++)
				b[i]=a[i];
			a=b;
			max*=2;
			a[++top]=x;
		}
		else
		{
			a[++top]=x;
			System.out.print("Inputted!");
		}
	}

	public int pop()
	{
		return top==-1 ? -99 : a[top--];
	}
	
	public void display()
	{
		System.out.println("\nThe stack: ");
		for(int i=0; i<=top; i++)
			System.out.print(a[i]+"  ");
	}
}

public class StackMain
{
	public static void main(String[] args)
	{
		FixedStack obj=new FixedStack(5);
		obj.push(2);
		obj.push(1);
		obj.push(3);
		obj.display();
		System.out.println("Deleted: "+obj.pop()); 
		System.out.println("Deleted: "+obj.pop());
		obj.display();
		
		DStack obj2=new DStack(3);
		obj2.push(2);
		obj2.push(1);
		obj2.push(3);
		obj2.display();
		obj2.push(4);
		obj2.display();
	}
}
