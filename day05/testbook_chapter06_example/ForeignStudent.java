package testbook_chapter06_example;

public class ForeignStudent extends Student {
	
	protected String gucjuc;
	
	ForeignStudent(String name, int age, int hacbun, String gucjuc) {
		super(name, age, hacbun);
		this.gucjuc = gucjuc;
	}

	public String getGucjuc() {
		return gucjuc;
	}

	void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, hacbun, gucjuc);
	}
	
}
