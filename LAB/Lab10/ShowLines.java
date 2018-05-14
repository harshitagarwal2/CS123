import java.io.*;
class ShowLines
{
	public static void main(String[] args)
	{
		String file = "words.txt", line = null,word="",w;
		int cnt=0,i;

		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader br=new BufferedReader(fileReader);
            BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter word to search for: ");
            w = br2.readLine();

			while((line = br.readLine()) != null)
			{
				cnt++;
				line+=" ";
				for(i=0; i<line.length(); i++)
				{
					char ch = line.charAt(i);
					if(Character.isLetterOrDigit(ch))
						word+=ch;
					else if(word.length()>0)
					{
						if(word.equalsIgnoreCase(w))
							System.out.println(cnt+") "+line);
						word="";
					}
				}
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to open file");
		}
		catch(IOException e)
		{
			System.out.println("Error reading file name");
		}
	}
}

