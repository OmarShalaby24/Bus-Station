import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Login {
	
	static Button log;
	static String user;
	static String pass;
	static Person manager = new Manager();
	static Person passenger = new Passengers();
	static Person driver = new Driver();
	
//	-----------------------------------------------------------------Passenger----------------------------------------------------
	public static void Passenger() {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Log in as Passenger");
		Window.setResizable(false);
		
		TextField username = new TextField();
		username.setMaxWidth(300);
		PasswordField password = new PasswordField();
		password.setMaxWidth(300);
		username.setPromptText("UserName");
		password.setPromptText("Password");
		Button log = new Button("Log in");
		log.setOnAction(e->{
			String user = username.getText();
			String pass = password.getText();
			System.out.println(user+pass);
			if(Plogin(user,pass)) {
				Profile.FILE=username.getText();
				System.out.println(Profile.FILE+".txt");
				Window.close();
				Profile.Passenger();
			}
			else {
				Error.display("Invalid PASSENGER username or password");
			}
		});
		Button sign = new Button("Sign up");
		sign.setOnAction(e->{
			Signup_Passenegr.signUpAsPassenger();
			});
		
		VBox v1 = new VBox(10);
		v1.setAlignment(Pos.CENTER);
		v1.getChildren().addAll(username,password,log,sign);
		
		StackPane layout = new StackPane();	
		
		layout.getChildren().add(v1);
		Scene scene = new Scene(layout,400,150);
		Window.setScene(scene);
		Window.setResizable(false);
		Window.show();
	}
//	-----------------------------------------------------------------Driver-------------------------------------------------------
	public static void Driver() {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Log in as Driver");
		Window.setResizable(false);
		
		TextField username = new TextField();
		username.setMaxWidth(300);
		PasswordField password = new PasswordField();
		password.setMaxWidth(300);
		username.setPromptText("UserName");
		password.setPromptText("Password");
		log = new Button("Log in");
		VBox v1 = new VBox(10);
		v1.setAlignment(Pos.CENTER);
        v1.getChildren().addAll(username,password,log);
        
		
		log.setOnAction(e->{
			user = username.getText();
			pass = password.getText();
//			System.out.println(user+pass);
			if(Dlog(user,pass)) {
				Profile.FILE=username.getText();
				Assign.Driver = username.getText();
				System.out.println(Profile.FILE+".txt");
				Window.close();
				Profile.Driver();
			}
			else {
				Error.display("Invalid DRIVER username or password");
			}	
		});

		StackPane layout = new StackPane();
		
		layout.getChildren().add(v1);
		Scene scene = new Scene(layout,400,150);
		Window.setScene(scene);
		Window.setResizable(false);
		Window.show();
	}
	
	public static void Manager() {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Log in as Manager");
		Window.setResizable(false);
		
		TextField username = new TextField();
		username.setMaxWidth(300);
		PasswordField password = new PasswordField();
		password.setMaxWidth(300);
		username.setPromptText("UserName");
		password.setPromptText("Password");
		Button log = new Button("Log in");
		VBox v1 = new VBox(10);
		v1.setAlignment(Pos.CENTER);
        v1.getChildren().addAll(username,password,log);
		
		log.setOnAction(e->{
			String user = username.getText();
			String pass = password.getText();
			if(Mlog(user,pass)) {
				Profile.FILE = "Trips";
				System.out.println(Profile.FILE+".txt");
				Window.close();
				Profile.Manager();
			}
			else {
				Error.display("Invalid MANEGER username or password");
			}
				
		});
		
		StackPane layout = new StackPane();
		
		layout.getChildren().add(v1);
		Scene scene = new Scene(layout,400,150);
		Window.setScene(scene);
		Window.setResizable(false);
		Window.show();
	}
	private static boolean Plogin(String username,String password){
		File file = new File("Passengers.txt");
		passenger.username = username;
		passenger.password = password;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String u1 = sc.next();
				String p1 = sc.next();
				if(u1.equals(username)&&p1.equals(password)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	private static boolean Dlogin(String username,String password){
		String[] user = new String[5];
		String[] pass = new String[5];
		int i = 0;
		try {
			File passengersFile = new File("Drivers.txt");
			Scanner sc = new Scanner(passengersFile);
			while(sc.hasNext()) {
				user[i] = sc.next();
				pass[i] = sc.next();
				i++;
				sc.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();  
		}
		for(int j=0;j<i;j++) {
			System.out.println(user[j]+"-"+pass[j]+"-");
			if(username==user[j] || password==pass[j])
				return true;
		}
		return false;
	}
	private static boolean Mlogin(String username,String password){
		String user = null;
		String pass = null;
		try {
			File passengersFile = new File("Maneger.txt");
			Scanner sc = new Scanner(passengersFile);
			user = sc.next();
			pass = sc.next();
			sc.close();
		}
		catch(Exception e){
			e.printStackTrace();  
		}
		System.out.println(user+"-"+pass+"-");
		if(username==user || password==pass)
			return true;
		return false;
	}
	public static boolean Plog(String user,String pass) {
		File file = new File("Passengers.txt");
		String username = null;
		String password = null;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				username = sc.next(); 
				password = sc.next();
				if(username.equals(user)&&password.equals(pass)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean Mlog(String user,String pass) {
		File file = new File("Maneger.txt");
		String username = null;
		String password = null;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				username = sc.next(); 
				password = sc.next();
				if(username.equals(user)&&password.equals(pass)) {
					return true;
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean Dlog(String user,String pass) {
		File file = new File("Drivers.txt");
		String username = null;
		String password = null;
		String vehicle = null;
		String available = null;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				username = sc.next(); 
				password = sc.next();
				vehicle = sc.next();
				available = sc.next();
				if(username.equals(user)&&password.equals(pass)) {
					return true;
				}
			}sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
}