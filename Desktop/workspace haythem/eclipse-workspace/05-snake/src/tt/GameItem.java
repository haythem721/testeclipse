package tt;

import java.awt.Graphics;

public abstract class GameItem {
	private Point point;
	public GameItem(int x,int y) {
		// TODO Auto-generated constructor stub
		point=new Point(x, y);
	}
	public Point getPoint() {
		return point;
	}
	public abstract void paint(Graphics g);

}
