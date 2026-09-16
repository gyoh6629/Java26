package testbook_chapter06_example;

public class Phone {

	protected String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	void talk() {
		System.out.println(owner + "가 통화 중이다");
	}
}
