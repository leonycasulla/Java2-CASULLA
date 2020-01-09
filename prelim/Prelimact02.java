import java.io.*;

public class Prelimact02
{
	public static void main(String[] args)throws IOException {
		try{
			BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
			int ascii = 0;
			int i = 0;
			String data = "", fn = "", ln = "", cp = "";
			boolean equal = false;


		while((ascii = in.read())!=-1){
			String s = String.valueOf((char)ascii);
			data = data.concat(s);

			if (ascii == '\n'){ 
				data = ""; 
				i = 0;
			}
			if (ascii == ':'){ 
				i++;
			}
			if (data.equals("1001-11")){
				System.out.println("We've found the record!");
				equal = true;
			}
			if (equal == true && ascii != ':'){
				if (i == 1) fn = fn.concat(String.valueOf((char)ascii));
				if (i == 2) ln = ln.concat(String.valueOf((char)ascii));
				if (i == 3) cp = cp.concat(String.valueOf((char)ascii));
			}
			if (equal == true && ascii == '\n') equal = false;
		}
		in.close();
		System.out.println("Firstname:" + fn);
		System.out.println("Lastname:" + ln);
		System.out.println("cp:" + cp);

		} catch (IOException e) {
		System.out.println(e);
		}
	}
}
