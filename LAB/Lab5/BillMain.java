import java.util.Scanner;
import java.util.*;

class Patient
{
	String name;
	int age, hn;
	
	Patient(String n, int a,int h)
	{
		name=n;
		age=a;
		hn=h;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name= sc.nextLine();
		System.out.print("Enter age: ");
		age=sc.nextInt();
		System.out.print("Enter hospital number: ");
		hn=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("\nName: "+name+"\nAge: "+age+"\nHospital number: "+hn);
	}
}

class InPatient extends Patient
{
	String dept, rtype;
	int yr,mm,dd;
	
	InPatient(String na, int ag, int hs, String s, String t, int y,int m,int d)
	{
		super(na,ag,hs);
		dept=s;
		rtype=t;
		yr=y;
		mm=m;
		dd=d;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter department name: ");
		dept = sc.nextLine();
		System.out.print("Enter room type: ");
		rtype = sc.nextLine();
		System.out.print("Enter admission date details:\n");
		System.out.print("Enter year number: ");
		yr = sc.nextInt();
		System.out.print("Enter month number: ");
		mm = sc.nextInt();
		System.out.print("Enter day number: ");
		dd=sc.nextInt();	
	}

 	void display()
 	{
 		super.display();
 		System.out.println("\nDepartment: "+dept+"\nRoom type: "+rtype+"\nAdmission date: "+(dd+"/"+mm+"/"+yr));
	}
}

class Billing extends InPatient
{
	int y2,m2,d2;
	
	Billing(String na, int ag, int hs, String s, String t, int year,int month,int day,int y, int m, int d)
	{
		super(na,ag,hs,s,t,year,month,day);
		y2=y;
		m2=m;
		d2=d;
	}
	
	long days()
	{
		GregorianCalendar adm = new GregorianCalendar(yr,mm-1,dd);
		GregorianCalendar dis = new GregorianCalendar(y2,m2-1,d2);
		long diff = dis.getTimeInMillis()-adm.getTimeInMillis();
		return diff/(1000*60*60*24);
	}
	
	long totAmt()
	{
		long d = days(),bill=0;
		
		switch(rtype)
		{
			case "Special" :
			bill = (1000*d)+(200*d);
			break;
			
			case "SemiSpecial":
			bill = (500*d)+(100*d);
			break;
			
			case "General":
			bill = (100*d)+(50*d);
			break;
		}
		return bill;
	}	
	
	void display()
	{
		super.display();
		System.out.println("\nDischarge date: "+(y2+"/"+m2+"/"+d2));
		System.out.println("\nBill amount: Rs "+totAmt());
	}
}

class BillMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name,dept,rtype;
		int a,hn,yr,mm,dd,y,m,d;
		
		System.out.print("Enter patient name: ");
		name= sc.nextLine();
		System.out.print("Enter patient age: ");
		a=sc.nextInt();
		System.out.print("Enter hospital number: ");
		hn=sc.nextInt();
		System.out.print("\nEnter department name: ");
		dept = sc.nextLine();
		System.out.print("Enter room type: ");
		rtype = sc.nextLine();
		System.out.print("\nEnter admission date details:\n");
		System.out.print("Enter year number: ");
		yr = sc.nextInt();
		System.out.print("Enter month number: ");
		mm = sc.nextInt();
		System.out.print("Enter day number: ");
		dd=sc.nextInt();
		System.out.print("\nEnter discharge date details:\n");
		System.out.print("Enter year number: ");
		y = sc.nextInt();
		System.out.print("Enter month number: ");
		m = sc.nextInt();
		System.out.print("Enter day number: ");
		d=sc.nextInt();
		
		Billing obj=new Billing(name,a,hn,dept,rtype,yr,mm,dd,y,m,d);
		obj.display();
	}
}
