package testbook_chapter06_example;

public class Telephone extends Phone {

	private String when;
	
	Telephone(String owner) {
		super(owner);
	}
	
	Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.printf("%s가 없다. %s 전화 즐래.\n", owner, when);
	}
}
