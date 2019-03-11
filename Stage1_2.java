package teenGuti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Stage1_2 extends Application {
	
	public static void main(String[] args)
	{
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Pane pane = new Pane();
		
		Circle[] circle = new Circle[9];
	/*	circle.setCenterX(50);
		circle.setCenterY(50);
		circle.setRadius(5);
		circle.setFill(Color.RED);
		*/
		
		int x=100, i=0;
		for(int j=0; j<3; j++)
		{
			int y=100;
			for(int k=0; k<3; k++)
			{		
				circle[i] = new Circle();
				
				circle[i].setCenterX(x);
				circle[i].setCenterY(y);
				circle[i].setRadius(20);
				circle[i].setFill(Color.RED);
				
				pane.getChildren().addAll(circle[i]);
				
				y = y + 250;
				
			}
			
			x = x + 350;
		
		}
		
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(100);
		line.setEndX(800);
		line.setEndY(100);
		
		line.setStrokeWidth(15);
		
		Line line2 = new Line();
		line2.setStartX(100);
		line2.setStartY(350);
		line2.setEndX(800);
		line2.setEndY(350);
		
		line2.setStrokeWidth(15);
		
		Line line3 = new Line();
		line3.setStartX(100);
		line3.setStartY(600);
		line3.setEndX(800);
		line3.setEndY(600);
		
		line3.setStrokeWidth(15);
		
		Line line4 = new Line();
		line4.setStartX(100);
		line4.setStartY(100);
		line4.setEndX(100);
		line4.setEndY(600);
		
		line4.setStrokeWidth(15);
		
		Line line5 = new Line();
		line5.setStartX(450);
		line5.setStartY(100);
		line5.setEndX(450);
		line5.setEndY(600);
		
		line5.setStrokeWidth(15);
		
		Line line6 = new Line();
		line6.setStartX(800);
		line6.setStartY(100);
		line6.setEndX(800);
		line6.setEndY(600);
		
		line6.setStrokeWidth(15);
		
		Line line7 = new Line();
		line7.setStartX(100);
		line7.setStartY(100);
		line7.setEndX(800);
		line7.setEndY(600);
		
		line7.setStrokeWidth(15);
		
		Line line8 = new Line();
		line8.setStartX(800);
		line8.setStartY(100);
		line8.setEndX(100);
		line8.setEndY(600);
		
		line8.setStrokeWidth(15);
		
		
		
		pane.getChildren().addAll(line, line2, line3, line4, line5, line6, line7, line8);
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setMinHeight(700);
		primaryStage.setMinWidth(900);
	}

}