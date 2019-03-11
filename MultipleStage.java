package multipleTasks;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleStage extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox vbox = new VBox();
		vbox.setMinHeight(300);
		vbox.setMinWidth(500);
		vbox.setAlignment(Pos.CENTER);

		Button btn1 = new Button("Click me");
		
		vbox.getChildren().addAll(btn1);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				DialogBox box = new DialogBox();
				PrimaryStage.close();
				
			}
		});
		
		
		Scene scene = new Scene(vbox);
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}

}
