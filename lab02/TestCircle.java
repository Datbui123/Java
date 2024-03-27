package lab02;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		Circle color1 = new Circle();
		System.out.println("The circle has radius of " + color1.getColor());
		Circle c3 = new Circle();
		c3.setRadius(5.0);
		c3.setColor("green");
		System.out.println("The circle has radius of " + c3.getRadius() + " and color of " + c3.getColor());
		Circle c4 = new Circle(3.0, "black");
		System.out.println(c4.toString());
		Circle c5 = new Circle(1.2, null);
		System.out.println(c5.toString());
		}
}
