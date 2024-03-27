package lab04;

public class TestMyTriangle {
	public static void main(String[] args) {
		MyPoint a = new MyPoint(1, 0);
		MyPoint b = new MyPoint(1, 0);
		MyPoint c = new MyPoint(1, 6);
		MyTriangle abc = new MyTriangle(a, b, c);
		System.out.println(abc.toString());
		abc.printType();
		System.out.println(abc.getPerimeter());
	}
}