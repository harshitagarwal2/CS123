class N3_functions
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
}

class N3_matrixInsertDisplay extends N3_functions
{
	public static void main(String args[])
	{
		N3_functions obj=new N3_functions();
		obj.read();
		obj.display();	
	}
}
