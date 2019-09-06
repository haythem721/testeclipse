

import java.awt.*;

import javax.swing.JFrame;

/**
 * Created by haythem on 07/12/2018.
 */
public class Snake extends JFrame{

static final long STEP_TIME=1000;

Point[] tab;
Color color=new Color(255,0,0);
public enum Direction {
droite,bas,gauche,haut
}

private Direction nextdirection=Direction.droite;
private Direction lastDirection=Direction.droite; 

public Direction getLastDirection() {
	return lastDirection;
}

public void setLastDirection(Direction lastDirection) {
	this.lastDirection = lastDirection;
}

public Direction getNextdirection() {
	return nextdirection;
	
}

public void setNextdirection(Direction nextdirection) {
	this.nextdirection = nextdirection;
}

public Snake() {
	// TODO Auto-generated constructor stub
	this(10, 10);
	this.setSize(200, 300);
	this.setVisible(true);
	
}

    public Snake(int len,int y,int z)  {
        if(len<0)
            throw new IllegalArgumentException();
        tab=new Point[len];
        Point p=new Point(y,z);
        tab[0]=p;
    }
    public Snake(int y,int z)  {
        this(5,y,z);
    }

    public void paint(Graphics g)
    {
       //System.out.println(tab.length);
        g.setColor(color);
        for(int i=0;i<tab.length;i++) {
            if (tab[i] != null)
                g.fillRect(tab[i].getX(),tab[i].getY(),SnakeGame.SQUARE_SIZE, SnakeGame.SQUARE_SIZE);
            //System.out.println(i);
        }
    }

  public void step()
  {
	  System.arraycopy(tab, 0, tab, 1, tab.length-1);
	  Point p=tab[1];
	 // System.out.println(lastDirection);
	  
	  switch(nextdirection)
	  { case droite:{ //if(lastDirection==Direction.droite ||lastDirection==Direction.haut||lastDirection==Direction.bas)
		              tab[0].setX(p.getX()+SnakeGame.SQUARE_SIZE);
	                 //lastDirection=Direction.droite;
	                  break;}
	    case gauche:{//if(lastDirection==Direction.gauche ||lastDirection==Direction.haut||lastDirection==Direction.bas)
	    	        tab[0].setX(p.getX()-SnakeGame.SQUARE_SIZE);
	                        // lastDirection=Direction.gauche;
	                         break;}
	    case haut:{//if(lastDirection==Direction.droite ||lastDirection==Direction.haut||lastDirection==Direction.gauche)
	    	tab[0].setY(p.getY()-SnakeGame.SQUARE_SIZE);
	    //lastDirection=Direction.haut;
	    break;}
	    case bas:{//if(lastDirection==Direction.droite ||lastDirection==Direction.gauche||lastDirection==Direction.bas)
	    	tab[0].setY(p.getY()+SnakeGame.SQUARE_SIZE);
	    //lastDirection=Direction.bas;
	    break;}
	    
	               // 
	    
	  }
  }


}
