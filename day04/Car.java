package testbook_chapter04;

public class Car {

	private static int numOfCar = 0;
	private static int numOfRedCar = 0;
	private String color;
	
	public Car(String color) {
		this.color = color.toLowerCase();
		numOfCar++;
		if(color.toLowerCase().equals("red"))
			numOfRedCar++;
	}
	
	public static int getNumOfCar() {
		return numOfCar;
	}
	
	public static int getNumOfRedCar() {
		return numOfRedCar;
	}
	
}
