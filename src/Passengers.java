

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Passengers extends Person{
	
	
	public Passengers() {
		this.username = null;
		this.password = null;
	}
	public Passengers(String username,String password,String name) {
		this.username=username;
		this.password=password;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	static String[][] File = new String[100][3];
	static Scanner scan;
	public static boolean Login(String UN,String PW) {
		try{
			
		}catch(Exception e) {
			System.out.println("File not found");
		}
		
		return true;
	}
	
	public static void dp() throws FileNotFoundException {

		for(int i=0;i<100;i++) {
			for(int j=0;j<3;j++) {
				File[i][j]=scan.next();
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(File[i][j]);
			}
		}
	}
}