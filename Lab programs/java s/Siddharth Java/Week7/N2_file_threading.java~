//Assume that there exists a file with different file names stored in it. Every file name is placed on a separate line. Create two threads, which scan the first half, and the second half of the file respectively, to search the filenames which end with .cpp. Write those file names onto the screen.

//Hello.txt

import java.io.*;

class N2_file_threading extends Thread
{
	String fname;
	int start;
	int end;
	
	N2_file_threading(String fn, int start, int end)
	{
		fname=fn;
		this.start=start;
		this.end=end;
		start();
	}
	
	public void run() throws IOException
	{
		FileReader fin1=null;
		try
		{
			fin1=new FileReader(fname);
		}
		catch (Exception e)
		{
		}
		
		String str1;
		try
		{
			BufferedReader br1=new BufferedReader (fin1);
			for (int i=0;i<start; i++)
			{
				str1=br1.readLine();
			}
			for (int i=start; i<end; i++)
			{
				String str;
				str=br1.readLine();
				char ch[]=new char[4];
				str.getChars((str.length()-4),str.length(),ch,0);
				if (ch[0]=='.' && ch[1]=='c' && ch[2]=='p' && ch[3]=='p')
				{
					System.out.println(str);
				}
			}
			fin1.close();
		}
		catch(Exception e)
		{
		}

	}
}

class N2_file_main
{
	public static void main(String args[])
	{
		int count=0;
		FileReader fin=null;
		try
		{
			fin=new FileReader("file.txt");
		}
		catch (Exception e)
		{
		}
		BufferedReader br=new BufferedReader(fin);
		while(br.readLine()!=null)
		{
			count++;
		}
		N2_file_threading n1=new N2_file_threading("file.txt",0,count/2);
		N2_file_threading n2=new N2_file_threading("file.txt",count/2,count);
		fin.close();
	}
}
