package testbook_chapter07_example;

public interface Human {

	void eat();
	
	void print();
	
	static void echo() { //실습은 안해봤음, 인터페이스에서 스태틱 쓸거면 중괄호 필요
		System.out.println("야호!!!");
	};
}
