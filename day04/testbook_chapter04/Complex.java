package testbook_chapter04;

public class Complex {

	double a;
	double b = 0.0;
	
	public Complex(double a) {
		this.a = a;
	}
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println(a + " + " + b + "i");
	}
	
}
