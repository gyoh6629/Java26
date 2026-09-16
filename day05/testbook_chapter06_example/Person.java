package testbook_chapter06_example;

public class Person {
	
	protected String name;
	protected int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}
