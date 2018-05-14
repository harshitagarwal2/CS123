import java.io.*;

class Patient
{
	String name;
	int age, hno;

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
	int adm_date;
	inPatient(String s, int a, int h, String d, String r, int ad)
	{
		name=s;
		age=a;
		hno=h;
		d_name=d;
		r_type=r;
		adm_date=ad;
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
		System.out.println("Enter admission date: ");
		adm_date=Integer.parseInt(br.readLine());	
	}
	void display()
	{
		super.display();
		System.out.println("Department name: "+d_name);
		System.out.println("Room type: "+r_type);
		System.out.println("Admission date: "+adm_date);
	}
}

class N1_Billing extends inPatient
{
	int dis_date;
	N1_Billing(int di, String s, int a, int h, String d, String r, int ad)
	{
		super(s, a, h, d, r, ad);
		dis_date=di;
	}
	void input() throws IOException
	{
		super.input();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		System.out.println("Enter discharge date: ");
		dis_date=Integer.parseInt(br.readLine());	
	}
	void display()
	{
		super.display();
		System.out.println("Discharge date: "+dis_date);
	}
	
	public static void main(String args[]) throws IOException
	{
		N1_Billing obj=new N1_Billing(0,"",0,0,"","",0);
		obj.input();
		int bill=0;
		if (obj.r_type.equals("Special"))
		{
			bill=(obj.dis_date-obj.adm_date)*1200;
		}
		else if (obj.r_type.equals("SemiSpecial"))
		{
			bill=(obj.dis_date-obj.adm_date)*600;
		}
		else
		{
			bill=(obj.dis_date-obj.adm_date)*150;
		}
		obj.display();
		System.out.println("Bill: "+bill);
	}
}
