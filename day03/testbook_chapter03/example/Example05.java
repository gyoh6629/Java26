package testbook_chapter03;

public class Example05 {

	public static void main(String[] args) {
		for(int a = 1; a < 18; a++) {
			for(int b = 1; b < 18; b++) {
				for(int c = 1; c < 18; c++) {
					if(a + b + c <= 20 && (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b)) {
						System.out.printf("a =%d, b = %d, c = %d\n", a, b, c);
					}else {
						continue;
					}
				}
			}
		}
	}
}
