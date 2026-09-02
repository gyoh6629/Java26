package testbook_chapter03;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {

		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
		
	}
	
	static String input(String name) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(name + " : ");
		String rsp = sc.next();
		
		return rsp;
	}
	
	static void whosWin(String p1, String p2) {
		
		if(p1.equals(p2)) {
			System.out.println("무승부");
		}else {
			switch(p1.charAt(0)) {
			case 'r':
				if(p2.charAt(0) == 's') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			case 's':
				if(p2.charAt(0) == 'p') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			case 'p':
				if(p2.charAt(0) == 'r') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			}
		}
		
	}
}
