package testbook_chapter06_example;

public class Car extends Vehicle {

	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	void show() {
		System.out.printf("자동차 배기량 : %d, 자동차 기어 단수 : %d\n", displacement, gears);
	}
}
