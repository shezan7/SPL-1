package packageOfTeenGuti;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Stage2 extends VBox {
	
	public Stage2()
	{
		setAlignment(Pos.CENTER);
		
		Button btn = new Button();
		btn.setMinHeight(100);
		btn.setMinWidth(300);
		btn.setText("Play with Friend");
		btn.setFont(Font.font(40));
		
		btn.setOnAction(e->gameWithFriend());
		
		setSpacing(80);
		
		Button btn2 = new Button();
		btn2.setMinHeight(100);
		btn2.setMinWidth(300);
		btn2.setText("Play With Computer");
		btn2.setFont(Font.font(35));
		
		getChildren().addAll(btn, btn2);
		
	}
	
	public void gameWithFriend()
	{
		
		Stage3_1 pane = new Stage3_1();
		
		Scene scene = new Scene(pane);
		
		MainStage.getStage().setScene(scene);
        MainStage.getStage().setTitle("game");
	}

}
