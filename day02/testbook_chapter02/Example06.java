package textbook_chapter02;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도 입력 : ");
		double F = sc.nextDouble();
		
		double C = ((double)5/9)*(F-32);
		
		System.out.print("섭씨온도 : " + C);
		
	}
}
