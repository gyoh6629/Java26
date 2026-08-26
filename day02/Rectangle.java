package grammar;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이 : ");
		double garo = sc.nextDouble();
		System.out.print("직사각형의 세로 길이 : ");
		double sero = sc.nextDouble();
		
		double result = garo * sero;
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.", result);
		
	}

}
