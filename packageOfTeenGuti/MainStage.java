package packageOfTeenGuti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStage extends Application {
	
private static Stage stage;
	
public static Stage getStage()
{
        return stage;
}
	
public void start(Stage primaryStage) throws Exception {
	
		this.stage = primaryStage;
       
        Stage1 pane = new Stage1();
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setHeight(700);
        primaryStage.setWidth(900);
       
    }
	
	public static void main(String[] args)
	{
				
		Application.launch(args);
		
	}

}