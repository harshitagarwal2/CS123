import java.io.*;
public class ListDirectory
{
	public void list(String path, int level)
	{
		File dir = new File(path);
		File[] level1 = dir.listFiles();

		if(level1!=null && level1.length>0)
		{
			for(File a : level1)
			{
				for(int i=0; i<level; i++)
					System.out.print("\t");
				if(a.isDirectory())
				{
					System.out.print("[" + a.getName() + "]");
					list(a.getAbsolutePath(), level+1);
				}
				else
					System.out.println(a.getName());
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		ListDirectory obj = new ListDirectory();
		//String dir = System.getProperty("D:\harshit bckup\doc\manipal") + File.separator + "2nd Sem";
		obj.list("D:\harshit bckup\doc\manipal\2nd Sem\JAVA",0);
	}
}
