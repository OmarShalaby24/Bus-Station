
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Error {
	public static void display(String msg) {
		Stage Window = new Stage();
		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Error!");
		Window.setMinWidth(250);
		Window.setResizable(false);
		
		Label MSG = new Label();
		MSG.setText(msg);
		Button close = new Button("Close");
		close.setOnAction(e->Window.close());
		
		VBox v = new VBox();
		v.setPadding(new Insets(10,10,10,10));
		v.setSpacing(10);
		v.getChildren().addAll(MSG,close);

		StackPane layout = new StackPane();
		layout.getChildren().addAll(v);
		v.setAlignment(Pos.CENTER);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout,300,80);
		Window.setScene(scene);
		Window.show();
	}

}
