import java.io.*;
class Symmetric
{
	public static boolean isSym(int a[][], int r)
	{
		int i,j;
		
		for(i=0; i<r; i++)
			for(j=0; j<r; j++)
				if(a[i][j]!=a[j][i])
					return false;
		return true;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int r1,c1,i,j;
		
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
			
		System.out.println("\nGiven Matrix");
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c1; j++)
				System.out.print(arr1[i][j]+"  ");
			System.out.println();
		}
		
		if(isSym(arr1,r1))
			System.out.println("\nMatrix is symmetric!");
		else
			System.out.println("\nNot symmetric!");
	}
}
