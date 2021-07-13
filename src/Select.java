import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Select extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		PrimaryStage.setTitle("Bus Station");
		PrimaryStage.setResizable(false);
		
		StackPane layout1 = new StackPane();
		VBox v1 = new VBox(15);
		v1.setAlignment(Pos.TOP_LEFT);
		

		
		Label title = new Label("Login As");
		title.setFont(Font.font("arial",FontWeight.BOLD,FontPosture.REGULAR,16));
		
		ToggleGroup g1 = new ToggleGroup() ;
		RadioButton psngr = new RadioButton("Passenger");
		RadioButton drvr = new RadioButton("Driver");
		RadioButton mngr = new RadioButton("Manager");
		Button slct = new Button("Select");
		slct.setOnAction(e->{
			if(selected(psngr,drvr,mngr)==1) {
				PrimaryStage.close();
				Login.Passenger();
			}
			else if(selected(psngr,drvr,mngr)==2) {
				PrimaryStage.close();
				Login.Driver();
			}
			else if(selected(psngr,drvr,mngr)==3) {
				PrimaryStage.close();
				Login.Manager();
			}
			else if(selected(psngr,drvr,mngr)==0) {
				Error.display("Error!: You need to select one");
			}
		});
		HBox h = new HBox();
		h.setPadding(new Insets(10,10,10,130));
		h.setSpacing(10);
		h.getChildren().add(slct);
		
		v1.getChildren().addAll(title,psngr,drvr,mngr,h);

		v1.setPadding(new Insets(10,0,0,100));
		v1.setSpacing(20);
		
		psngr.setToggleGroup(g1);
		drvr.setToggleGroup(g1);
		mngr.setToggleGroup(g1);
		
		layout1.getChildren().addAll(v1);
		
		Scene Select = new Scene(layout1,300,200);
		PrimaryStage.setScene(Select);
		PrimaryStage.setResizable(false);
		PrimaryStage.show();
	}
	public static int selected(RadioButton X,RadioButton Y,RadioButton Z) {
		if (X.isSelected())
			return 1;
		else if(Y.isSelected())
			return 2;
		else if(Z.isSelected())
			return 3;
		else
			return 0;
	}

}

