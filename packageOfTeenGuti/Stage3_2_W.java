package packageOfTeenGuti;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Stage3_2_W extends VBox {
	
	public Stage3_2_W()
	{
		setAlignment(Pos.CENTER);
		
		Button btn = new Button();
		btn.setMinHeight(100);
		btn.setMinWidth(300);
		btn.setText("Congratulations, You Won!!!");
		btn.setFont(Font.font(40));
		btn.setTextFill(Color.DEEPPINK);
		
		setSpacing(80);
		
		Button btn2 = new Button();
		btn2.setMinHeight(100);
		btn2.setMinWidth(300);
		btn2.setText("Back to the Game");
		btn2.setFont(Font.font(40));
		btn2.setOnAction(e->back());
		
		getChildren().addAll(btn, btn2);
		
	}	
		
	public void back()
	{	
		Stage1 pane = new Stage1();
			
		Scene scene = new Scene(pane);
			
		MainStage.getStage().setScene(scene);			
	    MainStage.getStage().setTitle("two");
	}	

}
