package testbook_chapter03;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String iron = sc.next();
		System.out.print("영희 : ");
		String zero = sc.next();
		
		if(iron.equals(zero)) {
			System.out.println("무승부");
		}else {
			switch(iron.charAt(0)) {
			case 'r':
				if(zero.charAt(0) == 's') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			case 's':
				if(zero.charAt(0) == 'p') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			case 'p':
				if(zero.charAt(0) == 'r') {
					System.out.println("철수, 승!");
				}else {
					System.out.println("영희, 승!");
				}
				break;
			}
		}
	}
}
