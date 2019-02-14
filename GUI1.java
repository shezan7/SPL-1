package buildGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI1 extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		StackPane pane = new StackPane();
		pane.setMinHeight(300);
		pane.setMinWidth(500);
		
		Button btn = new Button();
		btn.setText("Click me");
		
		pane.getChildren().add(btn);
		
		Scene scene = new Scene(pane);	
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
