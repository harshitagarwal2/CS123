import java.io.*;

class N2_EmployeeFile
{
	String name;
	int age;
	double gs;
	float ths;
	char grade;
	
	N2_EmployeeFile()
	{
		name="";
		age=0;
		gs=0;
		ths=0;
		grade='A';
	}
}

class N2_EmployeeMain
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader (isr);
		int n;
		System.out.println("Enter number of employees: ");
		N2_EmployeeFile obj[]=new N2_EmployeeFile[3];
		obj[0]=new N2_EmployeeFile();
		obj[1]=new N2_EmployeeFile();
		obj[2]=new N2_EmployeeFile();
		FileWriter fin=null;
		FileWriter fin1=null;
		try
		{
			fin=new FileWriter("abc.txt");
			fin1=new FileWriter("def.txt");
		}
		catch(Exception e)
		{
		}
		PrintWriter pw=new PrintWriter(fin);
		PrintWriter pw1=new PrintWriter(fin1);
		try //Writing to file
		{
			for (int i=0; i<3; i++)
			{
			
			System.out.println("Employee "+(i+1)+": ");
			System.out.println("Enter name: ");
			obj[i].name=br.readLine();
			pw.print(obj[i].name);
			pw.print("  ");
			System.out.println("Enter age: ");
			obj[i].age=Integer.parseInt(br.readLine());
			pw.print(obj[i].age);
			pw.print("  ");
			System.out.println("Enter gross salary: ");
			obj[i].gs=Double.parseDouble(br.readLine());
			pw.print(obj[i].gs);
			pw.print("  ");
			System.out.println("Enter take home salary: ");
			obj[i].ths=Float.parseFloat(br.readLine());
			pw.print(obj[i].ths);
			pw.print("  ");
			System.out.println("Enter grade: ");
			obj[i].grade=(char) br.read();
			pw.print(obj[i].grade);
			pw.println();
			br.readLine();
			
			if (obj[i].grade=='a' || obj[i].grade=='A')
			{
				pw1.print(obj[i].name);
				pw1.print("  ");
				pw1.print(obj[i].age);
				pw1.print("  ");
				pw1.print(obj[i].gs);
				pw1.print("  ");
				pw1.print(obj[i].ths);
				pw1.print("  ");
				//obj[i].grade=(char) br.read();
				pw1.print(obj[i].grade);
				pw1.println();
			}
			}
		}
		catch (Exception e)
		{
		}
		
		fin.close();
		fin1.close();
		pw.close();
		pw1.close();
	} 
}
