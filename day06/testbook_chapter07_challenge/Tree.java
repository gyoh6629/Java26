package testbook_chapter07_challenge;

//public class Tree implements Countable{
//
//	String name;
//	int C = 5;
//	
//	public Tree(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public void count() {
//		System.out.printf("%s가 %d그루 있다.\n", name, C);
//	}
//	
//	public void ripen() {
//		System.out.printf("%s에 열매가 잘 익었다.\n", name);
//	}
//}

public class Tree extends Countable {
	
	Tree(String name, int num){
		super(name, num);
	}
	
	@Override
	void count() {
		System.out.printf("%s가 %d그루 있다.\n", name, num);
	}
	
	void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n", num, name);
	}
}