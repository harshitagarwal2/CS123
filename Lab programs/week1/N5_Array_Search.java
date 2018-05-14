class N5_Array_Search
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int s=5;
		int c=0;
		int i;
		for (i=0; i<5; i++)
		{
			if (s==arr[i])
			{
				c++;
				break;
			}
		}
			if (c>0)
			{
				System.out.println("Element found in location: "+(i+1));
			}
			else
			{
				System.out.println("Element not found");
			}
	}
}
