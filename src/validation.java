import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class validation {
	public static boolean plog(String user, String pass) {
		String[] usernames = new String[10];
		String[] passwords = new String[10];
		int  i = 0;
		try {
			File file=new File("Passengers.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				usernames[i] = sc.next();
				passwords[i] = sc.next();
				System.out.println(usernames[i]+" "+passwords[i]);
				i++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int j=0; j<i;j++) {
			if(user.equals(usernames[i]) && pass.equals(passwords[i]))
				return true;
		}
		return false;
	}
	
	public static boolean Dlog(String user, String pass) {
		String[] usernames = new String[10];
		String[] passwords = new String[10];
		int i = 0;
		try {
			File file =  new File ("Drivers");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				usernames[i] = sc.next();
				passwords[i] = sc.next();
				System.out.println(usernames[i]+" "+passwords[i]);
				i++;
			}
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int j=0; j<i;j++) {
			if(user.equals(usernames[i]) && pass.equals(passwords[i]))
				return true;
		}
		return false;
	}
}
