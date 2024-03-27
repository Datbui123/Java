package lab04;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(int x1,int y1,int x2,int y2,int x3, int y3) {
		this.v1.setX(x1);
		this.v1.setY(y1);
		this.v2.setX(x2);
		this.v2.setY(y2);
		this.v3.setX(x3);
		this.v3.setY(y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public String toString() {
		return "Triangle @ ("+this.v1.getX()+","+ this.v1.getY()+"), (" +this.v2.getX() +","+this.v2.getY()+"), ("+this.v3.getX()+ ","+this.v3.getY()+")";
	}

	public double getPerimeter() {
		double a1 = this.v1.distance(v2);
		double a2 = this.v2.distance(v3);
		double a3 = this.v3.distance(v1);
		return a1+a2+a3;
	}
	
	public void printType() {
		double a = this.v1.distance(v2);
		double b = this.v2.distance(v3);
		double c = this.v3.distance(v1);
		if(a==b && b==c) {
			System.out.println("equilateral");
		}
		else if (a==b || a==c || b==c) {
			System.out.println("isosceles");
		}
		else {
			System.out.println("scalene");
		}
	}
}