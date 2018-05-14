package p1;
public class N1_Maximum
{
	public int max(int x, int y, int z)
	{
		if (x>y)
		{
			if (x>z)
			{
				return x;
			}
			else
			{
				return z;
			}
		}
		else
		{
			if (y>z)
			{
				return y;
			}
			else
			{
				return z;
			}
		}
	}
	
	public float max(float x, float y, float z)
	{
		if (x>y)
		{
			if (x>z)
			{
				return x;
			}
			else
			{
				return z;
			}
		}
		else
		{
			if (y>z)
			{
				return y;
			}
			else
			{
				return z;
			}
		}
	}
	
	public int max(int x[])
	{
		int l=x[0];
		for (int i=1; i<x.length; i++)
		{
			if (l<x[i])
			{
				l=x[i];
			}
		}
		return l;
	}
	
	public int max(int x[][], int y, int z)
	{
		int l=x[0][0];
		for (int i=0; i<y; i++)
		{
			for (int j=0; j<z; j++)
			{
				if (l<x[i][j])
				{
					l=x[i][j];
				}
			}
		}
		return l;
	}
}
