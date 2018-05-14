import java.util.Scanner;
class Movie
{
	private String title, dir;
	private int yr;
	
	Movie()
	{
		title=dir="";
		yr=0;
	}
	
	void setTitle(String t)
	{
		title=t;
	}
	
	void setDirector(String d)
	{
		dir=d;
	}	
	
	void setYear(int yy)
	{
		yr=yy;
	}
	
	void display()
	{
		System.out.println(title+" directed by "+dir+" in "+yr);
	}
	
	void check(Movie m2)
	{
		if(yr==m2.yr)
			System.out.println("\nBoth movies were released in the same year!");
		if(dir.equalsIgnoreCase(m2.dir))
			System.out.println("\nBoth were directed by the same person!");
	}
}

class MovieMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String n,d;
		int y;
		
		System.out.println("Enter details of the first movie: ");
		System.out.println("Enter name: ");
		n = sc.nextLine();
		System.out.println("Enter director name: ");
		d = sc.nextLine();
		System.out.println("Enter release year: ");
		y = sc.nextInt();
		
		Movie obj=new Movie();
		obj.setTitle(n);
		obj.setDirector(d);
		obj.setYear(y);
	
		System.out.println("Enter details of the second movie: ");
		System.out.println("Enter name: "); sc.next();
		n = sc.nextLine();
		if(n.length()==0)
			n=sc.nextLine();
		System.out.println("Enter director name: ");
		d = sc.nextLine();
		System.out.println("Enter release year: ");
		y = sc.nextInt();
		
		Movie obj2=new Movie();
		obj2.setTitle(n);
		obj2.setDirector(d);
		obj2.setYear(y);
		
		System.out.println("\nFirst movie: ");
		obj.display();
		System.out.println("\nSecond movie: ");
		obj2.display();
		obj.check(obj2);
	}
}
	
