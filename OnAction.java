package buildGUI2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OnAction extends Application {
	
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
		
		Button btn = new Button("Submit");
		
		Label label = new Label();
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				label.setText("Hello "+text.getText());
				
			}
		});
		
		vbox.getChildren().addAll(text, btn);
		vbox.getChildren().add(label);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
