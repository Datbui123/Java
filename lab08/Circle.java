package lab08;

public class Circle {
	private double radius =1.0;
	String color  = "Red";
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
