package textbook_chapter02;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int m = num / 60;
		int h = m / 60;
		int s = num - 60*m - 360*h;
		
		System.out.printf("%d시 %d분 %d초", h, m, s);
	}
}
