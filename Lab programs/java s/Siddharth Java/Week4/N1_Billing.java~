import java.io.*;
import java.util.*;

class Patient
{
	String name;
	int age, hno;
	Patient()
	{
	}
	void input() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		System.out.println("Enter name: ");
		name=br.readLine();
		System.out.println("Enter age: ");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter hospital number: ");
		hno=Integer.parseInt(br.readLine());	
	}
	void display()
	{
		System.out.println("Details of patient: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Hospital number: "+hno);
	}
}

class inPatient extends Patient
{
	String d_name, r_type;
	Calendar adm_date;
	inPatient()
	{
	}
	inPatient(String s, int a, int h, String d, String r, Calendar c3)
	{
		name=s;
		age=a;
		hno=h;
		d_name=d;
		r_type=r;
		adm_date=c3;
	}
	void input() throws IOException
	{
		super.input();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		System.out.println("Enter department name: ");
		d_name=br.readLine();
		System.out.println("Enter room type: ");
		r_type=br.readLine();	
	}
	void display()
	{
		super.display();
		System.out.println("Department name: "+d_name);
		System.out.println("Room type: "+r_type);
	}
}

class N1_Billing_CalendarClass extends inPatient
{
	Calendar dis_date;
	N1_Billing_CalendarClass()
	{
	}
	N1_Billing_CalendarClass(String s, int a, int h, String d, String r, Calendar c3, Calendar c4)
	{
		super(s, a, h, d, r, c3);
		dis_date=c4;
	}
	void input() throws IOException
	{
		super.input();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);	
	}
	void display()
	{
		super.display();
	}
	
	public static void main(String args[]) throws IOException
	{
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		c1.set(2016,2,20);
		c2.set(2016,3,2);
		N1_Billing_CalendarClass obj=new N1_Billing_CalendarClass();
		obj.input();
		long bill=0;
		Date d1=c1.getTime();
		Date d2=c2.getTime();
		long k1=d1.getTime();
		long k2=d2.getTime();
		long k=k2-k1;
		if (obj.r_type.equals("Special"))
		{
			bill=(k/(24*60*60*1000))*1200;
		}
		else if (obj.r_type.equals("SemiSpecial"))
		{
			bill=(k/(24*60*60*1000))*600;
		}
		else
		{
			bill=(k/(24*60*60*1000))*150;
		}
		obj.display();
		System.out.println("Bill: "+bill);
	}
}
