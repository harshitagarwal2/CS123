class N4_functions
{
	int m[][]={ {1,2,3},{4,5,6},{7,8,9} };
	void read()
	{
		int m[][]={ {1,2,3},{4,5,6},{7,8,9} };
	}
	
	void display()
	{
		System.out.println("Matrix:\n");
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(m[i][j]+"\t");
			}
		System.out.println();
		}
	}
	int sum()
	{
		int s=0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				s+=m[i][j];
			}
		}
		return s;
	}
	
}

class N4_matrixInsertDisplay_and_Sum extends N4_functions
{
	public static void main(String args[])
	{
		N4_functions obj=new N4_functions();
		obj.read();
		obj.display();
		System.out.println("\nSum of all elements: "+obj.sum());
	}
}
