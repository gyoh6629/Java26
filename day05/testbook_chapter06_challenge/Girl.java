package testbook_chapter06_challenge;

public class Girl {
	
//	private String name;
	protected String name;
	
//	Girl() { // GirlTest에서 객체 생성할 때 아무 인자 없이 생성했지만 아래 생성자를 만듦으로서 인자를 줘야함
//	}		 // 상속받은 GoodGirl도 객체생성할 때 Girl 생성자를 호출하므로 같은 오류가 남 
	
	Girl(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
}
