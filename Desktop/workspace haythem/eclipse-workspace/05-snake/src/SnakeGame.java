import java.awt.Graphics ;
/**
 * Created by haythem on 07/12/2018.
 */
import java.awt.event.KeyEvent;

import Snake.Direction;
public class SnakeGame extends AudGameWindow {

      private int score;
      final static int SQUARE_SIZE=16;
      private int largeur;
      private int hauteur;
      Snake snake;
     long lastSnakeUpdate;
public SnakeGame()
{
    setTitle("AuD-Snake Score: "+score);
    hauteur=getGameAreaHeight()/SQUARE_SIZE;
    largeur=getGameAreaWidth()/SQUARE_SIZE;
    snake=new Snake((largeur*SQUARE_SIZE)/2,(hauteur*SQUARE_SIZE)/2);
    lastSnakeUpdate=System.currentTimeMillis();
   // System.out.println(hauteur+"  "+largeur);
    System.out.println("ok");
}
//int k=0;
//long x;
    @Override
    public void updateGame(long time) {
    	
    	
    	long intervall=time-lastSnakeUpdate;
    	
    	long nombre=intervall/snake.STEP_TIME;
    	
    	//snake.setNextdirection(snake.getNextdirection());
    	
    	for(int i=0;i<nombre;i++)
    	{   snake.step();
    		lastSnakeUpdate+=snake.STEP_TIME;
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    }

    @Override
    public void paintGame(Graphics g) {
     // g.setColor(new Color(255,0,0));
    	
     // g.fillRect((largeur*16)/2,(hauteur*16)/2,SQUARE_SIZE,SQUARE_SIZE);
    	
      snake.paint(g);
    	
        }
  
    @Override
    public void handleInput(int keyCode) {
    	
    	if (keyCode==KeyEvent.VK_RIGHT)
    		{if(snake.getLastDirection()!=Direction.gauche)   
    	       {snake.setNextdirection(Direction.droite);
    		
    	        snake.step(); 
    		  
    		   snake.setLastDirection(Direction.droite);
    		  
    	    
    	    }}
    	  
    	else if(keyCode==KeyEvent.VK_LEFT)
    		{if(snake.getLastDirection()!=Direction.droite)
  		      
    		{snake.setNextdirection(Direction.gauche);
    		
    		snake.step();
    		snake.setLastDirection(Direction.gauche);
    		
    		}}
    	else if(keyCode==KeyEvent.VK_UP)
    		{if(snake.getLastDirection()!=Direction.bas)	
    	       {snake.setNextdirection(Direction.haut);
    		
    		    snake.step();
    		 
    		   snake.setLastDirection(Direction.haut);
    		}}
    	else if(keyCode==KeyEvent.VK_DOWN)
    		{if(snake.getLastDirection()!=Direction.haut)
    		{snake.setNextdirection(Direction.bas);
    		
    		  snake.step();
    		 
    		  snake.setLastDirection(Direction.bas);
    		}
    		}
    	
           
    }
public static  void main(String args[])
{
    SnakeGame sg=new SnakeGame();
    sg.start();
    //sg.snake.setNextdirection(Direction.droite);
   // snake.setNextdirection(Direction.gauche);
	
   // while(true)
    //{
    	//sg.snake.step();
    	
    //}
      
}
}
