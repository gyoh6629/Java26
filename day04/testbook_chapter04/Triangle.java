package testbook_chapter04;

public class Triangle {
	// 1.
	private double b;
	private double h;
	
	public Triangle() {
	}
	
	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}
	
	public double getB() {
		return b;
	}
	
	public double getH() {
		return h;
	}
	
	public double findArea() {
		return b * h / 2;
	}
	
	// 2.
	public boolean isSameArea(Triangle t) {
		if(findArea() == t.findArea()) {
			return true;
		}else {
			return false;
		}
	}
	
}
