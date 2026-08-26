package grammar;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("5개 숫자를 입력하세요.");
		for(int i = 0; i < 5; i++) {
			
			num = sc.nextInt();
			sum += num;
		}
		System.out.print("5개 숫자의 합은 " + sum + "입니다.");
	}
}
