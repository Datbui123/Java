package lab04;

public class MyCircle {
	private MyPoint center;
	private int radius;
	public MyCircle(MyPoint center, int radius) {
		
		this.center = center;
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setCenterXY(int x,int y) {
		this.center.setXY(x, y);
	}
	public String toString() {
		return "Circle @" + "("+this.center.getX()+","+ this.center.getY()+")"+"radius: " + radius + "]";
		
	}
	public double getArea() {
		return Math.PI * this.radius *this.radius;
	}
}