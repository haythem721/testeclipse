package tt;
import java.awt.Graphics ;
/**
 * Created by haythem on 07/12/2018.
 */
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import tt.Snake.Direction;
public class SnakeGame extends AudGameWindow {

      private int score;
      final static int SQUARE_SIZE=16;
      private int largeur;
      private int hauteur;
      Snake snake;
     long lastSnakeUpdate;
     Brick[]wall;
     Apple a;
     final static int GROW_AMOUNT=20;
     //int score;
public SnakeGame()
{
    setTitle("AuD-Snake Score: "+score);
    hauteur=getGameAreaHeight()/SQUARE_SIZE;
    largeur=getGameAreaWidth()/SQUARE_SIZE;
    wall=new Brick[2*(hauteur+largeur)-4];
    int k=0;
    for(int j=0;j<hauteur;j++)
    {wall[k++]=new Brick(0,j*SQUARE_SIZE);
     wall[k++]=new Brick((largeur-1)*SQUARE_SIZE,j*SQUARE_SIZE);
     if(j==0 || j==hauteur-1)
  	  for(int i=1;i<largeur-1;i++)
  		  wall[k++]=new Brick(i*SQUARE_SIZE,j*SQUARE_SIZE);
  	  
    }
    snake=new Snake((largeur/2*SQUARE_SIZE),(hauteur/2*SQUARE_SIZE));
    createNewApple();
    //snake.tab[1]=new Point(((largeur/2-1)*SQUARE_SIZE), (hauteur/2)*SQUARE_SIZE);
    lastSnakeUpdate=System.currentTimeMillis();
    //snake1=new Snake(largeur*hauteur-(wall.length), snake.getX(), snake.getY());
    
}

    @Override
    public void updateGame(long time) {
    	
    	if(checkCollisions())
    	{JOptionPane.showMessageDialog(this, "you dead!your score="+score);
    		stop();
    	}
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
    	//g.fillOval(40, 40, 50, 50);
    	a.paint(g);
      snake.paint(g);
      for(int i=0;i<wall.length;i++)
    	  wall[i].paint(g);
     /* wall[0].paint(g);
      wall[1].paint(g);
     wall[10].paint(g);
     wall[11].paint(g);*/
      
    	
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
public boolean checkCollisions()
{ if(snake.collidesWith(a))
	{
	snake.grow(GROW_AMOUNT);
	score=Apple.getValue();
	createNewApple();
	
	setTitle("AuD-Snake Score: "+score);
	  //return false;
	}
else 
	{if(snake.collidesWithSelf())
	return true;
	for(int i=0;i<wall.length;i++)
	if(snake.collidesWith(wall[i]))
	  return true;
	}
  return false;
}

public void createNewApple()
{boolean test;
	do
{ test=true;
  int x=(int)(1+Math.random()*(largeur-2))*SQUARE_SIZE;
  int y=(int)(1+Math.random()*(hauteur-2))*SQUARE_SIZE;
		  //System.out.println("x="+x+",y="+y);
	a=new Apple(x,y);
	for(int i=0;i<snake.tab.length ;i++)
		if(snake.tab[i]!=null)
		if(a.getPoint().getX()==snake.tab[i].getX() && a.getPoint().getY()==snake.tab[i].getY() )
			{ test=false;
			 System.out.println("collision");
		    	break;
			}
}
while(!test);
}

}
