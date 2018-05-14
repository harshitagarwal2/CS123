import java.io.*;
class CountFile
{
	public static void main(String[] args) throws IOException
	{
		String file = "filesNames.txt", line = null,word="";
		int cnt=0,wrdCnt=0,i,lineCnt=0;
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader br=new BufferedReader(fileReader);

			while((line = br.readLine()) != null)
			{
				System.out.println(line);
				line+=" ";
				for(i=0; i<line.length(); i++)
				{
					char ch = line.charAt(i);
					if(Character.isLetterOrDigit(ch))
					{
						cnt++;
						word+=ch;
					}
					else if(word.length()>0)
					{
						wrdCnt++;
						word="";
					}
				}
				lineCnt++;
			}
			System.out.println("\nNumber of characters: "+cnt+"\nNumber of Words: "+wrdCnt+"\nNumber of lines: "+lineCnt);
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

