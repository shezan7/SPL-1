package buildGUI2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application {
	
	private static final double USE_COMPUTED_SIZE = 0;

	public static void main(String[] args)
	{
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		BorderPane pane = new BorderPane();
		pane.setMinHeight(400);
		pane.setMinWidth(700);
		
		VBox vbox = new VBox();
		vbox.setMinHeight(100);
		vbox.setMinWidth(USE_COMPUTED_SIZE);
		vbox.setStyle("-fx-background-color: green; -fx-border-color: red; -fx-border-width: 0 0 10 0");
		
		VBox vbox2 = new VBox();
		vbox2.setMinHeight(USE_COMPUTED_SIZE);
		vbox2.setMinWidth(USE_COMPUTED_SIZE);
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setSpacing(20);
		
		TextField user = new TextField();
		user.setMaxWidth(100);
		TextField password = new TextField();
		password.setMaxWidth(100);
		Button btn = new Button("Submit");
		Label label = new Label();
		
	
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				String username = user.getText();
				String pass = password.getText();
				
				if(username.equals("java") && pass.equals("1234"))
				{
					label.setText("Success");
				}
				else
				{
					label.setText("Wrong!!! Try again later!!!");
				}
				
			}
		});
		
		
		vbox2.getChildren().addAll(user, password, btn, label);
		
		
		pane.setTop(vbox);
		pane.setCenter(vbox2);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
