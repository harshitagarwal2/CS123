import p1.*;
import java.io.*;
class N1_Max
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader (isr);
		N1_Maximum m1=new N1_Maximum();
		System.out.println("Enter 3 numbers: ");
		int a,b,c;
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		System.out.println("Largest number: "+m1.max(a,b,c));
		System.out.println("Enter 3 numbers: ");
		float a1,b1,c1;
		a1=Float.parseFloat(br.readLine());
		b1=Float.parseFloat(br.readLine());
		c1=Float.parseFloat(br.readLine());
		System.out.println("Largest number: "+m1.max(a1,b1,c1));
		System.out.println("Enter number of elements: ");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.println("Enter a number: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Largest number: "+m1.max(arr));
		System.out.println("Enter number of rows: ");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns: ");
		int co=Integer.parseInt(br.readLine());
		int arr2[][]=new int[r][co];
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<co; j++)
			{
				System.out.println("Enter a number: ");
				arr2[i][j]=Integer.parseInt(br.readLine());
			}
		}
				System.out.println("Largest number: "+m1.max(arr2, r, co));
	}
}
