package packageOfTeenGuti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStage extends Application {
	
public void start(Stage primaryStage) throws Exception {
       
        Stage1_2 pane = new Stage1_2();
        
        Scene scene = new Scene(pane); 
        
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.show();   
       
    }
	
	public static void main(String[] args)
	{
				
		Application.launch(args);
		
	}

}