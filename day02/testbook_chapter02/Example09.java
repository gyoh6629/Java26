package textbook_chapter02;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int major = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int asdf = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int fdsa = sc.nextInt();
		
		int total = major + asdf + fdsa;
		
		System.out.print(total < 140 ? "졸업 불가능" : major < 70 ? "졸업 불가능" : (asdf > 30 && fdsa > 30) || (asdf + fdsa) >= 80 ? "졸업 가능" : "졸업 불가능");
		
	}
}
