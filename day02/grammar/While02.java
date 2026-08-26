package grammar;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		while(num != 0) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			System.out.println(num % 2 == 0 ? ">> 짝수입니다." : ">> 홀수입니다.");
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			num = sc.nextInt();
		}
	}
}
