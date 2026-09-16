package testbook_chapter06_example;

public class Smartphone extends Telephone {

	private String game;
	
	Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	void playGame() {
		System.out.printf("%s가 %s 게임을 하는 중이다.\n", owner, game);

	}
}
