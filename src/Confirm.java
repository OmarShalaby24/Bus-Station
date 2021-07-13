
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Confirm {
	public static void display(String msg) {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Confirm!");
		Window.setMinWidth(250);
		
		Label MSG = new Label();
		MSG.setText(msg);
		Button yes = new Button("Yes");
		yes.setOnAction(e->{
			Window.close();
			});
		Button no = new Button("No");
		no.setOnAction(e->{
			Window.close();
		});
		
		HBox h = new HBox();
		h.setPadding(new Insets(10,10,10,10));
		h.setSpacing(10);
		h.getChildren().addAll(yes,no);
		
		VBox layout = new VBox();
		layout.getChildren().addAll(MSG,h);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		Window.setScene(scene);
		Window.show();
	}
	
	private boolean YesNo() {
		return false;
		
	}

}
