package tt;


import java.awt.*;
import java.util.Arrays;

import javax.swing.JFrame;

/**
 * Created by haythem on 07/12/2018.
 */
public class Snake {

static final long STEP_TIME=600;

Point[] tab;
//Color color=new Color(255,0,0);
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
	/*this(10, 10);
	this.setSize(200, 300);
	this.setVisible(true);*/
	
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
        g.setColor(Color.blue);
        for(int i=0;i<tab.length;i++) {
            if (tab[i] != null)
                g.fillRect(tab[i].getX(),tab[i].getY(),SnakeGame.SQUARE_SIZE, SnakeGame.SQUARE_SIZE);
            //System.out.println(i);
        }
    }

  public void step()
  {
	 
	 // System.out.println(tab[0]);
	  System.arraycopy(tab, 0, tab, 1, tab.length-1);
	  //System.out.println(Arrays.toString(tab));
	 // System.out.println(lastDirection);
	  //System.out.println(tab[0]);
	  int dir=nextdirection.ordinal();
	  switch(dir)
	  { case 0:{ //if(lastDirection==Direction.droite ||lastDirection==Direction.haut||lastDirection==Direction.bas)
		              //tab[0].setX(tab[1].getX()+SnakeGame.SQUARE_SIZE);
		                tab[0]=new Point(tab[1].getX()+SnakeGame.SQUARE_SIZE, tab[1].getY());
		             /* System.out.println("tab[0]="+tab[0]);
		              System.out.println("step 1");
		              System.out.println(Arrays.toString(tab));
		              System.out.println("tab[0]="+tab[0]);*/
	                 //lastDirection=Direction.droite;
	                  break;}
	    case 2:{//if(lastDirection==Direction.gauche ||lastDirection==Direction.haut||lastDirection==Direction.bas)
	    	new Point(tab[1].getX()-SnakeGame.SQUARE_SIZE, tab[1].getY());
	    	tab[0]=new Point(tab[1].getX()-SnakeGame.SQUARE_SIZE, tab[1].getY());
	                        // lastDirection=Direction.gauche;
	                         break;}
	    case 3:{//if(lastDirection==Direction.droite ||lastDirection==Direction.haut||lastDirection==Direction.gauche)
	    	
	    	tab[0]=new Point(tab[1].getX(), tab[1].getY()-SnakeGame.SQUARE_SIZE);
	    //lastDirection=Direction.haut;
	    break;}
	    case 1:{//if(lastDirection==Direction.droite ||lastDirection==Direction.gauche||lastDirection==Direction.bas)
	    	//tab[0].setY(tab[1].getY()+SnakeGame.SQUARE_SIZE);
	    	tab[0]=new Point(tab[1].getX(), tab[1].getY()+SnakeGame.SQUARE_SIZE);
	    //lastDirection=Direction.bas;
	    break;}
	    
	               // 
	    
	  }
	  
  }

/*@Override
public String toString() {
	return "Snake [tab=" + Arrays.toString(tab) + ", color=" + color + ", nextdirection=" + nextdirection
			+ ", lastDirection=" + lastDirection + "]";
}*/

boolean collidesWith(GameItem item)
{
	return collidesWith(item.getPoint().getX(),item.getPoint().getY()) ;
	//return tab[0].getX()==item.getPoint().getX() && tab[0].getY()==item.getPoint().getY(); 
}

boolean collidesWith(int x, int y)
{ //System.out.println(tab[0]);
return tab[0].getX()==x && tab[0].getY()==y;
	//return collidesWith(item)
}
/*public boolean collidesWithSelf()
{ for(int i=1;i<tab.length;i++)
	if(tab[i]!=null)
	  if(tab[0].getX()==tab[i].getX() && tab[0].getY()==tab[i].getY())
	     return true;
return false;
}*/
public boolean collidesWithSelf()
{ System.out.println(Arrays.toString(tab));
	for(int i=1;i<tab.length && tab[i]!=null ;i++)
	
	  if(tab[0].getX()==tab[i].getX() && tab[0].getY()==tab[i].getY())
	     return true;
return false;
}
public int grow(int amount) {
	if(amount<=0) throw new IllegalArgumentException("valeur négatif");
	Point tt[]=new Point[tab.length+amount];
	System.arraycopy(tab, 0, tt, 0, tab.length);
	tab=tt;
		
	return amount;
	
	}


}