import java.util.Scanner;

class Count
{
	static int count;
	
	Count()
	{
		count=1;
	}
	
	Count(int cnt)
	{
		count=cnt+1;
	}
	
	static void showCount()
	{
		System.out.println("\nObjects created: "+count);
	}
}

class Counter
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int ch,i=0;
		Count obj=new Count();
		do
		{
			System.out.println("\nMENU OPTIONS\n1. Create object\n2. Show Count\n3. Exit");
			System.out.print("Enter choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				if(i++==0)
					obj=new Count();
				else
					obj = new Count(obj.count);
				break;
				
				case 2:
				obj.showCount();
				break;
				
				case 3:
				System.out.println("Thank You!");
				break;
			}
		}while(ch!=3);
	}
}
