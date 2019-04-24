package packageOfTeenGuti;

import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
//import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Stage3_1 extends Pane {
	
	double[][] board = new double[9][3];
	
	Ellipse[] guti = new Ellipse[6];
	
	
	public int selectedGuti, selectedPosition, previousPosiotion;
	public int selectedGuti2, selectedPosition2, previousPosiotion2;
	public int secondClick;
	public boolean firstTeamClick1=true, firstTeamClick2=false, 
			secondTeamClick1=false, secondTeamClick2=false, second=false;
	public int[][] path = new int[9][8];
	public boolean play=true;
	public int initial=2;
	
	
	double ballX;
    double ballY;
	
	public Stage3_1() {
		// TODO Auto-generated method stub
		
		
		makeGraph();
		
				
		Circle[] circle = new Circle[9];
		
		Line[][] line = new Line[8][2];
		
	/*	circle.setCenterX(50);
		circle.setCenterY(50);
		circle.setRadius(5);
		circle.setFill(Color.RED);
		*/
		
		int x=100;
		int index=0;
		int y=100;
		
		for(int j=0; j<3; j++)
		{			
			board[index][0]=x;
			board[index][1]=y;
			x=100;
			
			for(int k=0; k<3; k++)
			{		
				circle[index] = new Circle();
				circle[index].setCenterX(x);
				circle[index].setCenterY(y);
				circle[index].setRadius(30);
				//circle[index].setStrokeWidth(10);
				circle[index].setFill(Color.TRANSPARENT);
				
				getChildren().addAll(circle[index]);
				
				board[index][0]=x;
				board[index][1]=y;
				if(index<=2) board[index][2]=1;
				if(index>=6) board[index][2]=2;
				
				x = x + 350;
					
				index++;
				
			}
						
			y = y + 250;
			
		}
					
		
		line[0][0] = new Line();
		line[0][0].setStartX(100);
		line[0][0].setStartY(100);
		line[0][0].setEndX(450);
		line[0][0].setEndY(100);
		line[0][0].setStrokeWidth(15);
		
		line[0][1] = new Line();
		line[0][1].setStartX(450);
		line[0][1].setStartY(100);
		line[0][1].setEndX(800);
		line[0][1].setEndY(100);
		
		line[0][1].setStrokeWidth(15);
		
		line[1][0] = new Line();
		line[1][0].setStartX(100);
		line[1][0].setStartY(350);
		line[1][0].setEndX(450);
		line[1][0].setEndY(350);
		line[1][0].setStrokeWidth(15);
		
		line[1][1] = new Line();
		line[1][1].setStartX(450);
		line[1][1].setStartY(350);
		line[1][1].setEndX(800);
		line[1][1].setEndY(350);
		
		line[1][1].setStrokeWidth(15);
		
		line[2][0] = new Line();
		line[2][0].setStartX(100);
		line[2][0].setStartY(600);
		line[2][0].setEndX(450);
		line[2][0].setEndY(600);
		line[2][0].setStrokeWidth(15);
		
		line[2][1] = new Line();
		line[2][1].setStartX(450);
		line[2][1].setStartY(600);
		line[2][1].setEndX(800);
		line[2][1].setEndY(600);
	
		line[2][1].setStrokeWidth(15);
		
		line[3][0] = new Line();
		line[3][0].setStartX(100);
		line[3][0].setStartY(100);
		line[3][0].setEndX(100);
		line[3][0].setEndY(350);
		line[3][0].setStrokeWidth(15);
	
		line[3][1] = new Line();
		line[3][1].setStartX(100);
		line[3][1].setStartY(350);
		line[3][1].setEndX(100);
		line[3][1].setEndY(600);
		
		line[3][1].setStrokeWidth(15);
		
		line[4][0] = new Line();
		line[4][0].setStartX(450);
		line[4][0].setStartY(100);
		line[4][0].setEndX(450);
		line[4][0].setEndY(350);
		line[4][0].setStrokeWidth(15);
		
		line[4][1] = new Line();
		line[4][1].setStartX(450);
		line[4][1].setStartY(350);
		line[4][1].setEndX(450);
		line[4][1].setEndY(600);
		
		line[4][1].setStrokeWidth(15);
		
		line[5][0] = new Line();
		line[5][0].setStartX(800);
		line[5][0].setStartY(100);
		line[5][0].setEndX(800);
		line[5][0].setEndY(350);
		line[5][0].setStrokeWidth(15);
		
		line[5][1] = new Line();
		line[5][1].setStartX(800);
		line[5][1].setStartY(350);
		line[5][1].setEndX(800);
		line[5][1].setEndY(600);
		
		line[5][1].setStrokeWidth(15);
		
		line[6][0] = new Line();
		line[6][0].setStartX(100);
		line[6][0].setStartY(100);
		line[6][0].setEndX(450);
		line[6][0].setEndY(350);
		line[6][0].setStrokeWidth(15);
		
		line[6][1] = new Line();
		line[6][1].setStartX(450);
		line[6][1].setStartY(350);
		line[6][1].setEndX(800);
		line[6][1].setEndY(600);
		
		line[6][1].setStrokeWidth(15);
		
		line[7][0] = new Line();
		line[7][0].setStartX(800);
		line[7][0].setStartY(100);
		line[7][0].setEndX(450);
		line[7][0].setEndY(350);
		line[7][0].setStrokeWidth(15);
		
		line[7][1] = new Line();
		line[7][1].setStartX(450);
		line[7][1].setStartY(350);
		line[7][1].setEndX(100);
		line[7][1].setEndY(600);
		
		line[7][1].setStrokeWidth(15);
		
		
		/*Ellipse ellipse = new Ellipse();
		ellipse.setCenterX(450);
		ellipse.setCenterY(350);
		ellipse.setRadiusX(30);
		ellipse.setRadiusY(30);
		ellipse.setFill(Color.CYAN);*/
		
		
		/*guti[0] = new Ellipse();
		guti[0].setCenterX(100);
		guti[0].setCenterY(100);
		guti[0].setRadiusX(30);
		guti[0].setRadiusY(30);
		guti[0].setFill(Color.DARKVIOLET);
		
		guti[1] = new Ellipse();
		guti[1].setCenterX(450);
		guti[1].setCenterY(100);
		guti[1].setRadiusX(30);
		guti[1].setRadiusY(30);
		guti[1].setFill(Color.DARKVIOLET);
		
		guti[2] = new Ellipse();
		guti[2].setCenterX(800);
		guti[2].setCenterY(100);
		guti[2].setRadiusX(30);
		guti[2].setRadiusY(30);
		guti[2].setFill(Color.DARKVIOLET);
		
		guti[3] = new Ellipse();
		guti[3].setCenterX(100);
		guti[3].setCenterY(600);
		guti[3].setRadiusX(30);
		guti[3].setRadiusY(30);
		guti[3].setFill(Color.CYAN);
		
		guti[4] = new Ellipse();
		guti[4].setCenterX(450);
		guti[4].setCenterY(600);
		guti[4].setRadiusX(30);
		guti[4].setRadiusY(30);
		guti[4].setFill(Color.CYAN);
		
		guti[5] = new Ellipse();
		guti[5].setCenterX(800);
		guti[5].setCenterY(600);
		guti[5].setRadiusX(30);
		guti[5].setRadiusY(30);
		guti[5].setFill(Color.CYAN);*/
		
		
		
		addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
			
			if(play) {
				
				
				for(int c=0;c<9;c++)
				{
						
					if(c<=2&&guti[c].contains(e.getX(), e.getY())&&firstTeamClick1)
					{
													
							if(firstTeamClick2)
							{								
								guti[selectedGuti].setStroke(Color.BLACK);
							}
							
							for(int i=0;i<9;i++)
							{								
								if(guti[c].getCenterX()==circle[i].getCenterX()
										&&guti[c].getCenterY()==circle[i].getCenterY())
								{									
									previousPosiotion=i;
									break;
								}
							}
							
							selectedGuti=c;
							guti[c].setStroke(Color.RED);
							firstTeamClick2=true;
							
							System.out.println("1: selectedGuti "+selectedGuti+
									" previousPosiotion "+previousPosiotion);
							
							break;
						}
						
						if(circle[c].contains(e.getX(), e.getY())&&firstTeamClick2)
						{							
							selectedPosition=c;
							//second=true;
							
							System.out.println("1st player selectedPosition "+selectedPosition);
							
							for(int i=0;i<8;i++)
							{
								if(path[previousPosiotion][i]>=0
										&&path[previousPosiotion][i]==selectedPosition
										&&board[path[previousPosiotion][i]][2]==0)
								{									
									guti[selectedGuti].getFill();
									guti[selectedGuti].setCenterX(board[path[previousPosiotion][i]][0]);
									guti[selectedGuti].setCenterY(board[path[previousPosiotion][i]][1]);
									board[selectedPosition][2]=1;
									board[previousPosiotion][2]=0;
									guti[selectedGuti].setStroke(Color.BLACK);
									
									firstTeamClick2=false;
									firstTeamClick1=false;
									
									secondTeamClick1=true;
									
									winCheckGreenGuti();
									
									break;
								}
							}							
							
							break;
						}
						
												
						if(c<6 &&c>=3&&guti[c].contains(e.getX(), e.getY())&&secondTeamClick1)
						{								
							
								if(secondTeamClick2) 
								{									
									guti[selectedGuti2].setStroke(Color.BLACK);
								}
								
								for(int i=0;i<9;i++)
								{									
									if(guti[c].getCenterX()==circle[i].getCenterX()
											&&guti[c].getCenterY()==circle[i].getCenterY())
									{										
										previousPosiotion2=i;
										break;
									}
								}
								
								selectedGuti2=c;
								guti[c].setStroke(Color.RED);
								secondTeamClick2=true;
								
								System.out.println("2: selectedGuti2 "+selectedGuti2+
										" previousPosiotion2 "+previousPosiotion2);
								
								break;
							}
							
							if(circle[c].contains(e.getX(), e.getY())&&secondTeamClick2)
							{								
								selectedPosition2=c;
								//second=true;
								
								System.out.println("2nd player selectedPosition2 "+selectedPosition2);
								
								for(int i=0;i<8;i++)
								{
									if(path[previousPosiotion2][i]>=0
											&&path[previousPosiotion2][i]==selectedPosition2
											&&board[path[previousPosiotion2][i]][2]==0)
									{										
										guti[selectedGuti2].getFill();
										guti[selectedGuti2].setCenterX(board[path[previousPosiotion2][i]][0]);
										guti[selectedGuti2].setCenterY(board[path[previousPosiotion2][i]][1]);
										board[selectedPosition2][2]=2;
										board[previousPosiotion2][2]=0;
										guti[selectedGuti2].setStroke(Color.BLACK);
																				
										secondTeamClick1=false;
										secondTeamClick2=false;
										firstTeamClick1=true;
										
										winCheckBlueGuti();
										
										break;
									}
								}
								
								break;																
							
							}
																
					}
				
//				for(int i=0;i<9;i++)
//				{
//					
//					System.out.println(i + " " + board[i][2]);
//				}
											
			}
			
        });
       
	
        new AnimationTimer()
        {
           public void handle(long currentNanoTime)
           {  
        	
        	   
        	  
        	   
        	   
        	   
        	   
		   }
          }.start();
			
				
		getChildren().addAll(line[0][0], line[0][1], line[1][0], line[1][1], line[2][0], line[2][1], line[3][0], line[3][1], line[4][0], line[4][1], line[5][0], line[5][1], line[6][0], line[6][1], line[7][0], line[7][1]);
		
        
        drawGuti();
        		
	}
	
	
	
	

	public void winCheckGreenGuti()
	{
		
		int flag=0;
		
		if(board[6][2]==1 && board[7][2]==1 && board[8][2]==1)
		{			
			flag=1;
		}
		
		else if(board[3][2]==1 && board[4][2]==1 && board[5][2]==1)
		{			
			flag=1;
		}
		
		else if(board[0][2]==1 && board[3][2]==1 && board[6][2]==1)
		{			
			flag=1;
		}
		
		else if(board[1][2]==1 && board[4][2]==1 && board[7][2]==1)
		{			
			flag=1;
		}
		
		else if(board[2][2]==1 && board[5][2]==1 && board[8][2]==1)
		{			
			flag=1;
		}
		
		else if(board[0][2]==1 && board[4][2]==1 && board[8][2]==1)
		{			
			flag=1;
		}
		
		else if(board[2][2]==1 && board[4][2]==1 && board[6][2]==1)
		{			
			flag=1;
		}
		
		else flag=0;
		
		
		if(flag==1)
		{			
			System.out.println("Green Win!!");
			play=false;
		}
		
		else ;
		
	}

	
	
	
	public void winCheckBlueGuti()
	{
		
		int flag=0;
		
		if(board[0][2]==2 && board[1][2]==2 && board[2][2]==2)
		{			
			flag=1;
		}
		
		else if(board[3][2]==2 && board[4][2]==2 && board[5][2]==2)
		{			
			flag=1;
		}
		
		else if(board[0][2]==2 && board[3][2]==2 && board[6][2]==2)
		{			
			flag=1;
		}
		
		else if(board[1][2]==2 && board[4][2]==2 && board[7][2]==2)
		{			
			flag=1;
		}		
		
		else if(board[2][2]==2 && board[5][2]==2 && board[8][2]==2)
		{			
			flag=1;
		}
		
		else if(board[0][2]==2 && board[4][2]==2 && board[8][2]==2)
		{			
			flag=1;
		}
		
		else if(board[2][2]==2 && board[4][2]==2 && board[6][2]==2)
		{			
			flag=1;
		}
		
		else flag=0;
		
		
		if(flag==1)
		{			
			System.out.println("Blue Win!!");
			play=false;
		}
		
		else ;
		
	}
		
	
//	public void winCheck()
//	{
//	
//		
//		
//		
//		 A:for(int i=0;i<9;i++)
//		 {
//    		  
//			  for(int j=0;j<8;j++)
//			  {
//    			  
//				  if(board[i][2]!=0&&path[i][j]!=-1&&path[path[i][j]][j]!=-1)
//				  {
//					  
//					  double currentGuti=board[i][2];
//					  double next1=board[path[i][j]][2];
//					  double next2=board[path[path[i][j]][j]][2];
//					  
//    				  if(currentGuti==next1&&currentGuti==next2&&currentGuti==1)
//    				  {
//    					  
//    					  initial--;
//    					  
//    					  if(initial<=0)
//    					  {
//    						  System.out.println("GREEN guti win");
//    						  initial=0;
//    						  play=false;
//    					  }
//    					  
//    					  break A;
//    					  
//    				  }
//    				  else if(currentGuti==next1&&currentGuti==next2&&currentGuti==2)
//    				  {
//    					 
//    					  initial--;
//    					  
//    					  if(initial<=0)
//    					  {
//    						  System.out.println("BLUE guti win");
//    						  initial=0;
//    						  play=false;
//    						  
//    					  }
//    					  
//    					  break A;
//    					  
//    				  }
//     			 
//    			  
//    		  }
//		  }
//		  
//		  
//	  }
//	   
//	}
	
	public void drawGuti()
	{		
		int count=0;
		
		for(int k=0;k<9;k++)
		{			
			if(board[k][2]!=0)
			{					
				guti[count]=new Ellipse(); 
				guti[count].setCenterX(board[k][0]);
				guti[count].setCenterY(board[k][1]);
				guti[count].setRadiusX(30);
				guti[count].setRadiusY(30);
				guti[count].setStrokeWidth(3);
				guti[count].setStroke(Color.BLACK);				
				
				if(board[k][2]==1)
				{
					guti[count].setFill(Color.GREEN);				
				}
				else
					guti[count].setFill(Color.BLUE);
				
				getChildren().addAll(guti[count]);
				
				count++;
								
			}
						
		}
	}
	
	public void makeGraph()
	{		
		path[0][0]=-1;
		path[0][1]=-1;
		path[0][2]=-1;
		path[0][3]=-1;
		path[0][4]=1;
		path[0][5]=4;
		path[0][6]=3;
		path[0][7]=-1;
		
		
		path[1][0]=0;
		path[1][1]=-1;
		path[1][2]=-1;
		path[1][3]=-1;
		path[1][4]=2;
		path[1][5]=-1;
		path[1][6]=4;
		path[1][7]=-1;
		
		path[2][0]=1;
		path[2][1]=-1;
		path[2][2]=-1;
		path[2][3]=-1;
		path[2][4]=-1;
		path[2][5]=-1;
		path[2][6]=5;
		path[2][7]=4;
		
		
		path[3][0]=-1;
		path[3][1]=-1;
		path[3][2]=0;
		path[3][3]=-1;
		path[3][4]=4;
		path[3][5]=-1;
		path[3][6]=6;
		path[3][7]=-1;
		
		path[4][0]=3;
		path[4][1]=0;
		path[4][2]=1;
		path[4][3]=2;
		path[4][4]=5;
		path[4][5]=8;
		path[4][6]=7;
		path[4][7]=6;
		
		
		path[5][0]=4;
		path[5][1]=-1;
		path[5][2]=2;
		path[5][3]=-1;
		path[5][4]=-1;
		path[5][5]=-1;
		path[5][6]=8;
		path[5][7]=-1;
		
		
		path[6][0]=-1;
		path[6][1]=-1;
		path[6][2]=3;
		path[6][3]=4;
		path[6][4]=7;
		path[6][5]=-1;
		path[6][6]=-1;
		path[6][7]=-1;
		
		
		path[7][0]=6;
		path[7][1]=-1;
		path[7][2]=4;
		path[7][3]=-1;
		path[7][4]=8;
		path[7][5]=-1;
		path[7][6]=-1;
		path[7][7]=-1;
		
		
		path[8][0]=7;
		path[8][1]=4;
		path[8][2]=5;
		path[8][3]=-1;
		path[8][4]=-1;
		path[8][5]=-1;
		path[8][6]=-1;
		path[8][7]=-1;
		
		
		/*for(int i=0;i<9;i++) {
			
			System.out.print(i+"-->");
			for(int j=0;j<8;j++) {
				
				if(path[i][j]!=-1) System.out.print(path[i][j]+",");
			}
			System.out.println();
		}*/
		
		
		
	}

}