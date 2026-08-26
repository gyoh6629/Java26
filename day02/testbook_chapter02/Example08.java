package textbook_chapter02;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("0~999 사이의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		} while(num < 0 || num > 999);
		
		int num100 = num / 100;

		num -= num100*100;

		int num10 = num / 10;

		int num1 = num - num10*10;


		System.out.println("각 자릿수의 합 = " + (num100+num10+num1));
	}
}
