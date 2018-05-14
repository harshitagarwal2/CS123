package mypackages.p1;
import java.util.Scanner;

public class Maximum
{
	public static int max(int a, int b, int c)
	{
		return a>b && b>c ? a : b>a && b>c ? b : c;
	}

	public static float max(float a, float b, float c)
	{
		return a>b && b> c ? a : b>a && b>c ? b : c;
	}

	public static int max(int arr[], int n)
	{
		int i, max = arr[0];
		for(i=0; i<n; i++)
			if(arr[i]>max)
				max = arr[i];
		return max;
	}

	public static int max(int arr[][], int r, int c)
	{
		int i,j,max = arr[0][0];

		for(i=0; i<r; i++)
			for(j=0; j<c; j++)
				if(arr[i][j]>max)
					max = arr[i][j];
		return max;
	}
}
