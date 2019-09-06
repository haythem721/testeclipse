/**
 * Created by haythem on 07/12/2018.
 */
public class Point {
    @Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
