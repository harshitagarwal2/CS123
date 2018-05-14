import mypackages.p1.Maximum;
import java.util.Scanner;

public class MaxMain
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c,i,j,n,r,co;
		float x,y,z;

		System.out.print("Enter first integer: ");
		a= sc.nextInt();
		System.out.print("Enter second integer: ");
		b= sc.nextInt();
		System.out.print("Enter third integer: ");
		c= sc.nextInt();

		System.out.print("Enter first floating integer: ");
		x= sc.nextFloat();
		System.out.print("Enter second floating integer: ");
		y= sc.nextFloat();
		System.out.print("Enter third floating integer: ");
		z= sc.nextFloat();

		System.out.print("Enter size: ");
		n=sc.nextInt();

		int arr[]=new int [n];
		for(i=0; i<n; i++)
		{
			System.out.print("Enter element: ");
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter rows: ");
		r=sc.nextInt();
		System.out.print("Enter columns: ");
		co=sc.nextInt();
		int arr2[][]=new int [r][co];
		for(i=0; i<r; i++)
			for(j=0; j<co; j++)
			{
				System.out.print("Enter element: ");
				arr2[i][j]=sc.nextInt();
			}

		System.out.println("\nInteger max: "+Maximum.max(a,b,c));
		System.out.println("\nFloating max: "+Maximum.max(x,y,z));
		System.out.println("\nInteger max of 1-D array: "+Maximum.max(arr,n));
		System.out.println("\nInteger max of 2-D array: "+Maximum.max(arr2,r,co));
	}
}
