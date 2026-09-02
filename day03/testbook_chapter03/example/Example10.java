package testbook_chapter03;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}
	
	static boolean isPrime(int num) {
		if(num == 1)
			return false;
		if(num == 2)
			return true;
		if(num % 2 == 0)
			return false;
		for(int i = 3; i < num; i+=2) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
}
