import java.io.*;

public class Prelimact01
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("Phonebook.txt"));
		String data = "";
		while((data = in.readLine())!=null){
			System.out.println(data.toString());
		}
		in.close();
		}
	}
