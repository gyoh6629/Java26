package testbook_chapter03;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1:
			System.out.println("아주 잘했습니다");
			break;
		case 2:
		case 3:
			System.out.println("잘했습니다");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다");
			break;
		default:
			System.out.println("노력해야겠습니다");
		}
	}
}
