package multipleTasks;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScene extends Application {
	
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
		vbox.setSpacing(20);
		
		Label label1 = new Label("This is Scene 1");
		Button btn1 = new Button("Click me");
		
		vbox.getChildren().addAll(label1, btn1);
		
		
		VBox vbox2= new VBox();
		vbox2.setMinHeight(300);
		vbox2.setMinWidth(500);
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setSpacing(20);
		
		Label label2 = new Label("This is 2nd Scene");
		Button btn2 = new Button("Back");

		vbox2.getChildren().addAll(label2, btn2);
		
		
		Scene scene = new Scene(vbox);
		Scene scene2 = new Scene(vbox2);
	
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				PrimaryStage.setScene(scene2);
				
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				PrimaryStage.setScene(scene);
				
			}
		});
		
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}
	

}
