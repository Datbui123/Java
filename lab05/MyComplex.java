package lab05;

public class MyComplex {
	private double real;
	private double imag;
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "(" + real +  " + " + imag + "i)";
	}
	
	public boolean isReal() {
		return (imag == 0);
	}
	
	public boolean isImaginary() {
		return (real == 0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real) && (this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return this == another;
	}
	
	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double argumentInRadians() {
		return Math.atan2(imag, real);
	}
	
	public int argumentInDegrees() {
		return (int)(Math.atan2(this.imag, this.real)*(180/Math.PI));
	}
	
	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}
	
	public MyComplex add(MyComplex another) {
		return new MyComplex((another.getReal() + this.real) , (another.getImag() + this.imag));
	}
	
	public MyComplex subtract(MyComplex another) {
		return new MyComplex((this.real - another.getReal()), (this.imag - another.getImag()));
	}
	
	public MyComplex multiplyWith(MyComplex another) {
		return new MyComplex((another.getReal() * this.real - another.getImag() * this.imag), (another.getReal() * this.imag + another.getImag() * this.real));
	}
	
	public MyComplex divideBy(MyComplex another) {
		return new MyComplex((another.getReal() * this.real + another.getImag() * this.imag) / (another.getReal() * another.getReal()+ another.getImag() * another.getImag()), (another.getReal() * this.imag - another.getImag() * this.real) / (another.getReal() * another.getReal()+ another.getImag() * another.getImag()));
	}
}