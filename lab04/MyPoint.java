package lab04;

public class MyPoint {
	private int x;
	private int y;
	public MyPoint(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y -y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double distance(MyPoint other) {
		int xDiff = this.x - other.x;
		int yDiff = this.y - other.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
}