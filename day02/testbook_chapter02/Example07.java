package textbook_chapter02;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num % 4 == 0 && num % 5 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(num % 4 == 0 || num % 5 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if((num % 4 == 0 && num % 5 != 0) || (num % 5 == 0 && num % 4 != 0)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
