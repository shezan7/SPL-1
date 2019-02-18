package buildGUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GUI3 extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	AnchorPane anchor = new AnchorPane();
	anchor.setMinHeight(300);
	anchor.setMinWidth(500);

	
	Button btn = new Button("Ok");
	btn.setLayoutX(100);
	btn.setLayoutY(100);
	
	TextField text = new TextField();
	text.setAlignment(Pos.CENTER);
	text.setMinHeight(50);
	text.setLayoutX(100);
	text.setLayoutY(150);
	
	anchor.getChildren().addAll(text, btn);
	
	
	Scene scene = new Scene(anchor);
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}

}
