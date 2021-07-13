import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Signup_Passenegr {
	public static void signUpAsPassenger() {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Sign Up as Passenger");
		Window.setResizable(false);

		TextField username = new TextField();
		username.setMaxWidth(300);
		PasswordField password = new PasswordField();
		password.setMaxWidth(300);
		username.setPromptText("UserName");
		password.setPromptText("Password");
		Button sign = new Button("Sign up");
		sign.setOnAction(e->{
			if(username.getText()!=null && password.getText()!=null) {
				addPassenger(username.getText(), password.getText());
				Window.close();
			}
		});
		VBox v1 = new VBox(10);
		v1.setAlignment(Pos.CENTER);
		v1.getChildren().addAll(username,password,sign);
		
		StackPane layout = new StackPane();	
		
		layout.getChildren().add(v1);
		Scene scene = new Scene(layout,400,200);
		Window.setScene(scene);
		Window.setResizable(false);
		Window.show();
		
	}
	
	
	public static void addPassenger(String user,String pass) {
		// create a file for a passenger
		try {
			System.out.println("hi");
			File file = new File(user+".txt");
			OutputStream out = new FileOutputStream(file);
			out.write("".getBytes());
			out.close();
		} catch (IOException e) {
			System.out.println("fuck");
		}
		
		try {
			System.out.println("hi");
			File file = new File(user+".txt");
			String username = " "+user;
			OutputStream a = new FileOutputStream("Passengers.txt",true);
			a.write(username.getBytes());
			a.close();
			String password = " "+pass;
			OutputStream b = new FileOutputStream("Passengers.txt",true);
			b.write(password.getBytes());
			b.close();
			
		} catch (IOException e) {
			System.out.println("fuck");
		}
	}	
}
