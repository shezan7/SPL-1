package buildGUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI2 extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox vbox = new VBox();
		vbox.setMinHeight(300);
		vbox.setMinWidth(500);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);
		
		TextField text = new TextField();
		text.setMaxWidth(300);
		text.setAlignment(Pos.CENTER);
		
		Button btn = new Button("Click me");
		//btn.setText("Click me");
		
		vbox.getChildren().addAll(text, btn);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
