package testbook_chapter07_example;

public class FlyableTest {

	public static void main(String[] args) {
		
		class F implements Flyable {
			public void speed() {
				System.out.println("속도");
			}
			
			public void height() {
				System.out.println("높이");
			}
		}
		
		Flyable f = new F();
		f.speed();
		f.height();
	}
}
