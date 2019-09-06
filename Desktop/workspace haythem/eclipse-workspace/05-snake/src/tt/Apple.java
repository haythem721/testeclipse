package tt;

import java.awt.Color;
import java.awt.Graphics;

public class Apple extends GameItem {
	private static int value=0;

	public static int getValue() {
		return value;
	}

	public Apple(int x, int y) {
		super(x, y);
		value++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillOval(getPoint().getX(), getPoint().getY(), SnakeGame.SQUARE_SIZE, SnakeGame.SQUARE_SIZE);
		//System.out.println("cercle:("+getPoint().getX()+","+getPoint().getY()+")");
	}
	
}
