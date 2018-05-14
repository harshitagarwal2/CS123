class N3_Movie
{
	private char title[]=new char[100];
	private char name[]=new char[100];
	private int year;

	public void setTitle(char a[])
	{
		for (int i=0; a[i]!='\0'; i++)
		{
			title[i]=a[i];
		}
	}
	
	public void setDirector(char a[])
	{
		for (int i=0; a[i]!='\0'; i++)
		{
			 name[i]=a[i];
		}
	}

	public void setYear(int a)
	{
		year=a;
	}

	void display()
	{
		System.out.print("Name of movie: ");
		for (int i=0; title[i]!='\0'; i++)
		{
			System.out.print(title[i]);
		}
		System.out.print("\nName of director: ");
		for (int i=0; title[i]!='\0'; i++)
		{
			System.out.print(name[i]);
		}
		System.out.println("\nYear of release: "+year);
	}
	
	void compare(N3_Movie obj3)
	{
		if (this.year==obj3.year)
		{
			System.out.println("The two movies were released in the same year");
		}
		else
		{
			System.out.println("The two movies were released in different years");
		}
		int flag=0;
		for (int i=0; name[i]!='\0'; i++)
		{
			if (this.name[i]!=obj3.name[i])
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("The two movies have the same director");
		}
		else
		{
			System.out.println("The two movies have different directors");
		}
	}
}

class N3_movie_compare
{
	public static void main(String args[])
	{
		N3_Movie obj1=new N3_Movie();
		N3_Movie obj2=new N3_Movie(); 
		char title1[]={'M','a','n',' ','o','f',' ','S','t','e','e','l','\0'};
		char title2[]={'W','a','t','c','h','m','e','n','\0'};
		int year1=2013;
		int year2=2011;
		char name1[]={'Z','a','c','k',' ','S','n','y','d','e','r','\0'};
		char name2[]={'Z','a','c','k',' ','S','n','y','d','e','r','\0'};
		obj1.setTitle(title1);
		obj2.setTitle(title2);
		obj1.setYear(year1);
		obj2.setYear(year2);
		obj1.setDirector(name1);
		obj2.setDirector(name2);
		obj1.display();
		obj2.display();
		obj1.compare(obj2);
	}
}
