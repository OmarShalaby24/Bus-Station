import java.io.FileOutputStream;
import java.io.OutputStream;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddDriver {
	public static void display() {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Add a Driver");
		
		TextField username = new TextField();
		username.setPromptText("UserName");
		username.setMaxWidth(300);
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		password.setMaxWidth(300);
		ChoiceBox<String> vehicle = new ChoiceBox<>();
		vehicle.getItems().add("Bus");
		vehicle.getItems().add("Mini-Bus");
		vehicle.getItems().add("Limousine");
		vehicle.setValue("Bus");
		vehicle.setMaxWidth(300);
		Button add = new Button("Add");
		add.setOnAction(e->{
			String a = username.getText();
			String b = password.getText();
			String c = vehicle.getValue();
			if(a!=null||b!=null||c!=null) {
				add(a,b,c);
				Window.close();
			}
			else
				Error.display("SomeField is Empty");
		});
		
		StackPane main = new StackPane();
		
		VBox v1 = new VBox(10);
		v1.setAlignment(Pos.CENTER);
		v1.getChildren().addAll(username,password,vehicle,add);
		
		main.getChildren().add(v1);
		Scene scene = new Scene(main,400,200);
		Window.setScene(scene);
		Window.show();
		
	}
	
	public static void add(String username,String password,String Vehicle) {
		try {
			OutputStream newFile = new FileOutputStream(username+".txt");
			newFile.write("".getBytes());
			newFile.close();
			
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		try {
			String add = username+" "+password+" "+Vehicle+" "+"true"+"  ";
			OutputStream addedDriver = new FileOutputStream("Drivers.txt",true);
			addedDriver.write(add.getBytes());
			addedDriver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
