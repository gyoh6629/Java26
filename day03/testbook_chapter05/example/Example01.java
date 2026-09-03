package testbook_chapter05;

public class Example01 {

	public static void main(String[] args) {
		String s = "asdfaaa";
		char c = 'a';
		
		System.out.println(countChar(s, c));
	}
	
	static int countChar(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) count++;
		}
		return count;
	}
}
