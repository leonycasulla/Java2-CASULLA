import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args){
		try {
			File Leony = new File ("Phonebook.txt");
			Scanner scanner = new Scanner (Leony);
			String code =" ";
			while(scanner.hasNext()) {
				code = scanner.next();
				if(code.equals("'1001-11")) {
					System.out.println("code found!");
					System.out.println("Code:" +code);
					System.out.println("First Name" + scanner.next());
					System.out.println("Last Name" + scanner.next());
					System.out.println("Cp No." + scanner.next());
					continue;
				}
			}
			scanner.close();
			}
			catch(IOException e) {
				System.out.println("Error");
			}
		}		
	}
		