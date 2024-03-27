package lab04;

public class TestMyCircle {
	public static void main(String[] args) {
		MyPoint m1 = new MyPoint(2, 4);
		MyCircle c1 = new MyCircle(m1, 3);
		System.out.println(c1.toString());
		System.out.println(c1.getArea());
	}
}