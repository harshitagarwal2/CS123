import java.util.*;

class N2_Time
{
	int h,m,s;
	
	N2_Time()
	{
		h=0;
		m=0;
		s=0;
	}
	
	void read()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter hours: ");
		h=s1.nextInt();
		System.out.println("Enter minutes: ");
		m=s1.nextInt();
		System.out.println("Enter seconds: ");
		s=s1.nextInt();
	}

	void display()
	{
		System.out.println("Time: "+h+":"+m+":"+s);
	}

	N2_Time add (N2_Time obj3)
	{
		N2_Time obj4=new N2_Time();
		obj4.s=this.s+obj3.s;
		if (obj4.s >= 60)
		{
			obj4.s=obj4.s-60;
			obj4.m+=1;
		}
		obj4.m+=(this.m+obj3.m);
		if (obj4.m >= 60)
		{
			obj4.m=obj4.m-60;
			obj4.h+=1;
		}
		obj4.h+=(this.h+obj3.h);
		return obj4;
	}
	
	N2_Time sub (N2_Time obj3)
	{
		N2_Time obj4=new N2_Time();
		obj4.h=this.h-obj3.h;
		obj4.m=this.m-obj3.m;
		obj4.s=this.s-obj3.s;
		return obj4;
	}

	int compare (N2_Time obj3)
	{
		int sec1=(this.h*3600)+(this.m*60)+this.s;
		int sec2=(obj3.h*3600)+(obj3.h*3600)+obj3.s;
		if (sec1 > sec2)
		{
			return 1;
		}
		else if (sec2 > sec1)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

class N2_Time_add_sub_compare
{	
	public static void main (String args[])
		{
			N2_Time obj1=new N2_Time();
			N2_Time obj2=new N2_Time();
			N2_Time obj5=new N2_Time();
			obj1.read();
			obj2.read();
			obj1.display();
			obj2.display();
			obj5=obj1.add(obj2);
			obj5.display();
			obj5=obj1.sub(obj2);
			obj5.display();
			int c=obj1.compare(obj2);
			if (c==1)
			{
				System.out.println("First time is greater");
			}
			else if (c==-1)
			{
				System.out.println("Second time is greater");
			}
			else
			{
				System.out.println("Both are equal");
			}
		}
}
