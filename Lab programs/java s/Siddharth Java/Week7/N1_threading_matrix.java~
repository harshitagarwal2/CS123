import java.io.*;

class N1_threading_matrix extends Thread
{
	int arr[];
	int size;
	int rowsum;
	
	N1_threading_matrix(int a[], int j, String name)
	{
		super(name);
		arr=new int[j];
		arr=a;
		size=j;
		rowsum=0;
		
		start();
	}
	
	public void run()
	{
		for (int i=0; i<size; i++)
		{
			rowsum+=arr[i];
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("caught");
			}
		}
	}
}

class N1_threading_main
{
	public static void main(String args[])
	{
		int mat[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		N1_threading_matrix n1=new N1_threading_matrix(mat[0],4,"first");
		N1_threading_matrix n2=new N1_threading_matrix(mat[1],4,"second");
		N1_threading_matrix n3=new N1_threading_matrix(mat[2],4,"third");
		N1_threading_matrix n4=new N1_threading_matrix(mat[3],4,"fourth");
		
		try
		{
			n1.join();
			n2.join();
			n3.join();
			n4.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("caught");
		}
		int totsum=n1.rowsum+n2.rowsum+n3.rowsum+n4.rowsum;
		System.out.println("Total sum: "+totsum);
	}
}
