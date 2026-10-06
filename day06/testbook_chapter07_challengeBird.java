package testbook_chapter07_challenge;

//public class Bird implements Countable {
//
//	String name;
//	int C = 2;
//	
//	public Bird(String name){
//		this.name = name;
//	}
//	
//	@Override
//	public void count() {
//		System.out.printf("%s가 %d마리 있다.\n", name, C);
//	}
//	
//	public void fly() {
//		System.out.printf("%d마리 %s가 날아간다.\n", C, name);
//	}
//}

public class Bird extends Countable {
	
	Bird(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}
	
	public void fly() {
	System.out.printf("%d마리 %s가 날아간다.\n", num, name);
}
}
