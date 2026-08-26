package grammar;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int price = sc.nextInt();
		System.out.println("동전의 수 >");
		
		int coin500 = price / 500;
		int coin100 = price % 500 / 100;
		
		System.out.println("500원짜리 = " + coin500 + "개");
		System.err.println("100원짜리 = " + coin100 + "개");
		
	}
	
}
