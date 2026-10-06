package testbook_chapter07_example;

public class Concrete extends Abstract {

	int j;
	
	Concrete(int i, int j){
		super(i);
		this.j = j;
	}
	
	@Override
	void show() {
		System.out.printf("i = %d, j = %d",i,j);
	}
}
