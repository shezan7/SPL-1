package packageOfTeenGuti;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Stage1 extends VBox{

		public Stage1()
		
		{
			setAlignment(Pos.CENTER);
			
			Button btn = new Button();
			btn.setMinHeight(100);
			btn.setMinWidth(300);
			btn.setText("Play Game");
			btn.setFont(Font.font(40));
			
			btn.setOnAction(e->twoPlayer());
			
	     //	btn[i].setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
        //    btn.setAlignment(Pos.CENTER);
       //     btn.setTextFill(Color.DARKVIOLET);
			
			setSpacing(80);
			
			Button btn2 = new Button();
			btn2.setMinHeight(100);
			btn2.setMinWidth(300);
			btn2.setText("Exit");
			btn2.setFont(Font.font(40));
			
			getChildren().addAll(btn, btn2);
			
		}
		
		public void twoPlayer()
		{
			
			Stage2 pane = new Stage2();
			
			Scene scene = new Scene(pane);
			
			MainStage.getStage().setScene(scene);
	        MainStage.getStage().setTitle("two");
		}

}
