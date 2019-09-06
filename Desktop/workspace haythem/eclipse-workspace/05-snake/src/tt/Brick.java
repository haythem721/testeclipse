package tt;

import java.awt.Color;
import java.awt.Graphics;

public class Brick extends GameItem {

	
	public Brick(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(getPoint().getX(), getPoint().getY(), SnakeGame.SQUARE_SIZE, SnakeGame.SQUARE_SIZE);
		// TODO Auto-generated method stub
		
	}

}
