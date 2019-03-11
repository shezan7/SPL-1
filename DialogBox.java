package multipleTasks;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DialogBox extends MultipleStage {
	
	DialogBox()
	{
		VBox vbox = new VBox();
		vbox.setMinHeight(300);
		vbox.setMinWidth(500);
		vbox.setAlignment(Pos.CENTER);
		
		Label label1 = new Label("This is the Stage 2");
		
		vbox.getChildren().addAll(label1);
		
		
		Scene scene = new Scene(vbox);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}

}
