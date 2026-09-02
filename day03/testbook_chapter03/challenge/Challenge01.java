package testbook_chapter03;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		int result;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = 1;
		while(n > 0) {
			result *= n--;
		}
		System.out.println(result);
//------------------------------------------------------------------		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = 1;
		while(true) {
			result *= n--;
			if(n == 0) break;
		}
		System.out.println(result);
		
	}
}
