package grammar;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		while(num < 0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			num = sc.nextInt();
		}
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
}
