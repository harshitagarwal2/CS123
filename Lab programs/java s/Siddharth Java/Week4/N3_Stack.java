import java.io.*;

class N3_Stack
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		System.out.println("Enter number of elements: ");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int tos=-1, ch=0;
		while (ch!=3)
		{
			System.out.println("1. Push ");
			System.out.println("2. Pop ");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			ch=Integer.parseInt(br.readLine());
			switch (ch)
			{
				case 1:
					if (tos==(n-1))
					{ 
						System.out.println("Stack overflow");
					}
					else
					{
						System.out.println("Enter element to push: ");
						tos++;
						arr[tos]=Integer.parseInt(br.readLine());
					}
					break;
					
				case 2: if (tos==-1)
					{
						System.out.println("Stack underflow");
					}
					else
					{
						System.out.println(arr[tos]);
						tos--;
					}
					break;
				case 3: System.out.println("Goodbye");
			}
		}
	}
}	
