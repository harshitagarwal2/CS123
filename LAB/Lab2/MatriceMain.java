import java.io.*;
class Matrice
{
	private int r, c, arr[][];
	
	Matrice(int r1, int c1)
	{
		r=r1;
		c=c1;
		arr=new int [r][c];
	}
	
	void accept() throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
			{
				System.out.print("Enter element: ");
				arr[i][j]=Integer.parseInt(br.readLine());
			}
	}
	
	void display() 
	{
		int i,j;
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	
	int sum()
	{
		int i,j,s=0;
		
		for(i=0; i<r; i++)
			for(j=0; j<c; j++)
				s+=arr[i][j];
		return s;
	}
}

class MatriceMain
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int r,c;
		
		System.out.print("Enter rows: ");
		r=Integer.parseInt(br.readLine());
		System.out.print("Enter columns: ");
		c=Integer.parseInt(br.readLine());
		
		Matrice obj=new Matrice(r,c);
		System.out.println("\nEnter the details of the array: ");
		obj.accept();
		
		System.out.println("\nGiven array: ");
		obj.display();
		
		if(r==c)
			System.out.println("\nSum of elements: "+obj.sum());
		else
			System.out.println("\nNot a square matrix!");
	}
}
