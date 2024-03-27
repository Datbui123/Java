package lab05;

public class TestMyComplex {
	public static void main(String[] args) {
		MyComplex a1 = new MyComplex(1.1, 2.2);
		MyComplex a2 = new MyComplex(3.3, 4.4);
		MyComplex a3 = new MyComplex(0, 4.4);
		MyComplex a4 = new MyComplex(3.3, 0);
		
		System.out.println(a1);
		System.out.println(a3.isImaginary());
		System.out.println(a4.isReal());
		
		System.out.println(a1.add(a2));
		System.out.println(a1.subtract(a2));
		System.out.println(a1.multiplyWith(a2));
		System.out.println(a1.divideBy(a2));
		
		System.out.println(a1.conjugate());
		System.out.println(a1.equals(1.2, 2.2));
		System.out.println(a1.equals(a2));
		System.out.println(a1.argumentInDegrees());
		System.out.println(a1.argumentInRadians());
	}
}