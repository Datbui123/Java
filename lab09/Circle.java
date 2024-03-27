package lab09;

public class Circle extends Shape{
	protected double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		return radius*2*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle with radius = "+radius+", color = "+color+", filled = "+filled;
	}
	
}
