class N2_symmetricMatrix
{
	public static void main(String args[])
	{
		int m[][]={ {1,0,0},{0,1,0},{0,0,1} };
		int c=0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (m[i][j]!=m[j][i])
				{
					c++;
					break;
				}
			}
			if (c>0)
			{
				break;
			}
		}
		if (c>0)
		{
			System.out.println("Not a symmetric matrix");
		}
		else
		{
			System.out.println("Symmetric matrix");
		}
	}
}
