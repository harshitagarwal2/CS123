import java.util.Scanner;
class Time
{
	private int hh,mm,s;
	
	Time(int hr, int min, int sec)
	{
		hh=hr;
		mm=min;
		s=sec;
	}
	
	void display()
	{
		System.out.println(hh+" : "+mm+" : "+s);
	}
	
	Time add(Time t2)
	{
		int tot = ((hh*3600) + (mm*60) + s) + (t2.hh*3600 + t2.mm*60 + t2.s);
		Time obj=new Time(0,0,0);
		
		obj.hh = tot/3600;
		obj.mm = (tot%3600)/60;
		obj.s = (tot%3600)%60;
		
		if(obj.hh>23)
			obj.hh = obj.hh%24;
		return obj;
	}
	
	Time sub(Time t2)
	{
		int t = ((hh*3600) + (mm*60) + s) - (t2.hh*3600 + t2.mm*60 + t2.s), tot=Math.abs(t);
		Time obj=new Time(0,0,0);
		
		obj.hh = tot/3600;
		obj.mm = (tot%3600)/60;
		obj.s = (tot%3600)%60;

		return obj;
	}
	
	void compare(Time t2)
	{
		if((hh>t2.hh) || (hh==t2.hh && mm>t2.mm) || (hh==t2.hh && mm==t2.mm && s>t2.s))
			System.out.println("First time object is greater!");
		else if(hh==t2.hh && mm==t2.mm && s==t2.mm)
			System.out.println("Both Time objects are equal!");
		else
			System.out.println("Second Time object is greater!");
	}
}

class TimeMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h1,m1,s1,h2,m2,s2;
		
		System.out.println("Enter details of first Time: ");
		System.out.print("Enter hour: ");
		h1 = sc.nextInt();
		System.out.print("Enter minute: ");
		m1 = sc.nextInt();
		System.out.print("Enter second: ");
		s1 = sc.nextInt();
		
		System.out.println("Enter details of second Time: ");
		System.out.print("Enter hour: ");
		h2 = sc.nextInt();
		System.out.print("Enter minute: ");
		m2 = sc.nextInt();
		System.out.print("Enter second: ");
		s2 = sc.nextInt();
		
		Time obj=new Time(h1,m1,s1) , obj2=new Time(h2,m2,s2);
		
		System.out.println("\nFirst Time: ");
		obj.display();
		System.out.println("\nSecond Time: ");
		obj2.display();
		System.out.println("\nAddition Time: ");
		obj.add(obj2).display();
		System.out.println("\nSubtracted Time: ");
		obj.sub(obj2).display();
		System.out.println();
		obj.compare(obj2);
	}
}
