import java.io.*;

class MatriceSum
{
	public static void display(int a[][],int r, int c)
	{
		int i,j;
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
	}
	
	public static void sum(int a[][], int b[][], int r1, int c1)
	{
		int s[][]=new int [r1][c1],i,j;
		for(i=0; i<r1; i++)
			for(j=0; j<c1; j++)
				s[i][j] = a[i][j]+b[i][j];
				
		System.out.println("\nSummation matrix: ");
		display(s,r1,c1);
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int r1,r2,c1,c2,i,j;
		
		System.out.println("Enter details of first matrix: ");
		System.out.println("Enter rows: ");
		r1=Integer.parseInt(br.readLine());
		System.out.print("Enter columns: ");
		c1=Integer.parseInt(br.readLine());
		int arr1[][]=new int [r1][c1];
		
		for(i=0; i<r1; i++)
			for(j=0; j<c1; j++)
			{
				System.out.print("Enter element: ");
				arr1[i][j]=Integer.parseInt(br.readLine());
			}
			
		System.out.println("Enter details of second matrix: ");
		System.out.println("Enter rows: ");
		r2=Integer.parseInt(br.readLine());
		System.out.print("Enter columns: ");
		c2=Integer.parseInt(br.readLine());
		int arr2[][]=new int [r2][c2];
		
		for(i=0; i<r2; i++)
			for(j=0; j<c2; j++)
			{
				System.out.print("Enter element: ");
				arr2[i][j]=Integer.parseInt(br.readLine());
			}	
		
		System.out.println("\nFirst Matrix:");
		display(arr1,r1,c1);
		
		System.out.println("\nSecond Matrix:");
		display(arr2,r2,c2);
		
		if(r1==r2 && c1==c2)
			sum(arr1,arr2,r1,c1);
		else
			System.out.println("Not conformable");
	}
}
		
