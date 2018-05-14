import java.io.*;
class CopyFile
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try
		{
			fin = new FileInputStream("input.txt");
		}
		catch+FileNotFoundException e)
		{
			System.out.println("\nUnable to open file");
		}

		try
		{
			fout = new FileOutputStream("output.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\nUnable to open file");
		}

		try
		{
			int i;
			do
			{
				i = fin.read();
				if(i!=-1)
					fout.write(i);
			}while(i!=-1);
			System.out.println("\nFile copied successfully");
		}
		catch(IOException e)
		{
			System.out.println("File Error");
		}
		finally
		{
		fin.close();
		fout.close();
		}
	}
}
