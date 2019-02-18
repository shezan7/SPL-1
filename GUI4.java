package buildGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI4 extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	BorderPane border = new BorderPane();
	border.setMinHeight(500);
	border.setMinWidth(300);
	
	VBox vbox = new VBox();
	vbox.setMinHeight(50);
	vbox.setMinWidth(500);
	vbox.setStyle("-fx-background-color: red");
	
	HBox hbox = new HBox();
	hbox.setMinHeight(50);
	hbox.setMinWidth(500);
	hbox.setStyle("-fx-background-color: green");
	
	VBox vbox2 = new VBox();
	vbox2.setMinHeight(200);
	vbox2.setMinWidth(100);
	vbox2.setStyle("-fx-background-color: blue");
	
	
	border.setTop(vbox);
	border.setLeft(vbox2);
	border.setBottom(hbox);
		
		
	Scene scene = new Scene(border);
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}

}
