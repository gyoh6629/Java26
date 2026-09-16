package testbook_chapter06_example;

public class MovablePoint extends Point {

	private int xSpeed, ySpeed;
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	
	void toStringg() {
		System.out.printf("좌표 : (%d, %d), 이동속도 : (%d, %d)\n", super.getX(), super.getY(), xSpeed, ySpeed);
	}
}
