package testbook_chapter07_example;

public class Student implements Human {

	int age;
	
	Student(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(age + "세의 학생입니다.");
	}
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	// 자식은 스태틱 안만들어도 됨
//	public static void echo() {
//		System.out.println("야효!!!");
//	}
}
