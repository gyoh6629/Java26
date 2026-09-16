package testbook_chapter06_example;

public class Point {

	private int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	void toStringg() {
		System.out.printf("좌표 : (%d, %d)\n", x, y);
	}
}
