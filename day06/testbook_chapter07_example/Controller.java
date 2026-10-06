package testbook_chapter07_example;

public abstract class Controller {

	boolean power;
	
	Controller(boolean power){
		this.power = power;
	}
	
	void show() {
		if(power) {
			System.out.println("가 켜졌습니다.");
		}else {
			System.out.println("가 꺼졌습니다.");
		}
	};
	
	abstract String getName();
}
