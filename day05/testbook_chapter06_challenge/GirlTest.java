package testbook_chapter06_challenge;

public class GirlTest {
	
	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
//		
//		g2.show(); // -> g2는 Girl 타입인데 Girl 클래스에는 아무 메서드가 없음, show()메서드는 GoodGirl 클래스의 메서드임
//		gg.show();
		
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		
		for(Girl g : girls) {
			g.show();
		}
	}
}
