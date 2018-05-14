import java.io.*;

class CopyFileCharacter
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr = new FileReader("input1.txt");
			fw = new FileWriter("output1.txt");

			int i;
			do
			{
				i=fr.read();
				if(i!=-1)
					fw.write("hello my name is harshit");
			}while(i!=-1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to open file");
		}
		fr.close();
		fw.close();
	}
}
