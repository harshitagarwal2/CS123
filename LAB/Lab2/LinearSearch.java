import java.io.*;

class LinearSearch
{
	public static int linear(int arr[], int n, int s)
	{
		int i;
		for(i=0; i<n; i++)
			if(arr[i]==s)
				return (i+1);
		return -1;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int n,i,srch,pos;
		
		System.out.print("Enter n: ");
		n=Integer.parseInt(br.readLine());
		int arr[]=new int [n];
		
		for(i=0; i<n; i++)
		{
			System.out.print("Enter element: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.print("\nEnter element to search for: ");
		srch=Integer.parseInt(br.readLine());
		
		System.out.print("\nThe array given by the user: ");
		for(i=0; i<n; i++)
			System.out.print(arr[i]+"  ");
			
		pos=linear(arr,n,srch);
		if(pos==-1)
			System.out.println("\nElement not found");
		else
			System.out.println("\nElementn found at: "+pos);
	}
}
