import java.util.*;
class thread extends Thread
{
	Thread t;
	String nm;
	thread(String n)
	{
	nm=n;
	t=new Thread(this,nm);
	System.out.println("Child Thread"+t);
	t.start();
	}

	public void run()
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread"+i+"  "+nm);
			Thread.sleep(500);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Child Interrupted: ");
	}
	System.out.println("Exiting Child Thread");
	}
}

class MultiThread
{
	public static void main(String args[])
	{
		new thread("Thread A");
		new thread("Thread B");
		new thread("Thread C");
		try
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("Main thread" +j);
				Thread.sleep(1000);
			}
		}
	catch(InterruptedException e)
	{
		System.out.println("Main Thread Interrupted: ");
	}
	System.out.println("Exiting Main Thread");
}
}
