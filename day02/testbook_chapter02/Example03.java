package textbook_chapter02;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥의 밑면 반지름은? ");
		double r = sc.nextInt();
		
		System.out.print("원기둥의 높이는? ");
		double h = sc.nextInt();
		
		final double pi = 3.14;
		
		double v = pi * r * r * h;
		
		System.out.print("원기둥의 부피는" + v);
		
	}
}
