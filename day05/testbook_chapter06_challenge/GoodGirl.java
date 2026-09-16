package testbook_chapter06_challenge;

public class GoodGirl extends Girl {

	GoodGirl(String name) {
		super(name);
	}
	
	void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}
}
