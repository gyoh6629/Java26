package testbook_chapter07_example;

public class Worker implements Human {

	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	
	public void print() {
		System.out.println("인간입니다.");
	}
	// 자식은 스태틱 안만들어도 됨
//	public static void echo() {
//		System.out.println("야호!!!");
//	}
}
