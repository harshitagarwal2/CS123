import java.util.Scanner;
class Account
{
	private String name, type;
	private long accno;
	private double bal;
	static double rate;

	Account()
	{
		name=type="";
		accno=0;
		bal=rate=0;
	}	
	
	Account(String n, String t, long a, double b, double r)
	{
		name=n;
		type=t;
		accno=a;
		bal=b;
		rate=r;
	}
	
	void display()
	{
		System.out.println("\nName: "+"\nAccount Number: "+accno+"\nType: "+type+"\nBalance: Rs "+bal);
	}
	
	static void showRate()
	{
		System.out.println("\nRate: "+rate);
	}
	
	void deposit(double amt)
	{
		if(amt>0)
		{
			System.out.println("\nDeposited successfully");
			bal+=amt;
		}
		else
			System.out.println("\nInvalid amount!");
	}
	
	void withdraw(double amt)
	{
		if(bal-amt>0)
		{
			System.out.println("\nAmount withdrawn successfully!");
			bal-=amt;
		}
		else
			System.out.println("\nInvalid amount!");
	}
}

class AccountMain
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String name,type;
		long acc;
		double bal,amt,rate;
		int choice;
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter Account type: ");
		type = sc.nextLine();
		System.out.print("Enter account number: ");
		acc = sc.nextLong();
		System.out.print("Enter balance: ");
		bal = sc.nextDouble();
		System.out.print("Enter rate of interest: ");
		rate = sc.nextDouble();
		
		Account obj = new Account(name, type, acc, bal, rate);
		do
		{
			System.out.println("\nMenu options\n1. Deposit\n2. Withdraw\n3. Show Details\n4. Display Rate\n5. Exit");
			System.out.print("Enter choice [1-5]: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.print("Enter the amount to deposit: ");
				amt = sc.nextDouble();
				obj.deposit(amt);
				break;
				
				case 2:
				System.out.print("Enter the amount to withdraw: ");
				amt = sc.nextDouble();
				obj.withdraw(amt);
				break;
				
				case 3:
				obj.display();
				break;
				
				case 4:
				obj.showRate();
				break;
				
				case 5:
				System.out.println("\nThank you!");
				break;
				
				default: 
				System.out.println("\nInvalid");
			}
		}while(choice!=5);
	}
}
