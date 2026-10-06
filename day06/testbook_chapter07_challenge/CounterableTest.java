package testbook_chapter07_challenge;

public class CounterableTest {

	public static void main(String[] args) {
//		Countable[] m = { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무") };
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };
		
		for (Countable e : m)
			e.count();
		
		for (int i=0; i < m.length; i++) {
			if(m[i] instanceof Bird) {
				Bird b = (Bird)m[i];
				b.fly();
			}else {
				Tree t = (Tree)m[i];
				t.ripen();
			}
		}
	}
}
