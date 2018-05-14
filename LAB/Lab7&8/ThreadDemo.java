import java.util.*;
class NewThread implements Runnable
{
	Thread t;
	
	NewThread()
	{
	t=new Thread(this,"demo thread");
	System.out.println("Child Thread"+t);
	t.start();
	}

	public void run()
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread"+i);
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

class ThreadDemo
{
	public static void main(String args[])
	{
		new NewThread();
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
