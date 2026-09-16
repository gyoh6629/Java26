package testbook_chapter06_example;

public class Vehicle {

	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show()	{
		System.out.printf("자동차 색상 : %s, 자동차 속도 : %d\n", color, speed);
	}
}
