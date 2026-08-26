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
		
		if(total < 140) {
			System.out.print("졸업 불가능");
		}else if(major < 70) {
			System.out.print("졸업 불가능");
		}else if((asdf > 30 && fdsa > 30) || (asdf + fdsa) >= 80) {
			System.out.print("졸업 가능");
		}else {
			System.out.print("졸업 불가능");
		}
	}
}
