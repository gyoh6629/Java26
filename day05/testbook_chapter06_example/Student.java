package testbook_chapter06_example;

public class Student extends Person {

	protected int hacbun;
	
	Student(String name, int age, int hacbun) {
		super(name, age);
		this.hacbun = hacbun;
	}

	public int getHacbun() {
		return hacbun;
	}
	
	void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, hacbun);
	}
}
