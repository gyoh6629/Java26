package testbook_chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] countStar = new int[10];
		Arrays.fill(countStar, 0);
		
		System.out.println("숫지를 10개 입력하세요.");
		
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			
			if(num >= 0 && num < 100) {
				countStar[num / 10]++;
			}else {
				continue;
			}
		}
		
		for(int i = 0; i < countStar.length; i++) {
			System.out.printf("%2d ~ %2d : ", i*10, i*10 + 9);
			for(int j = 0; j < countStar[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i = 0; i < 10; i++) {
//			int num = sc.nextInt();
//			if(num >= 0 && num < 100) {
//				if(num <= 9) countStar[0]++;
//				else if(num <= 19) countStar[1]++;
//				else if(num <= 29) countStar[2]++;
//				else if(num <= 39) countStar[3]++;
//				else if(num <= 49) countStar[4]++;
//				else if(num <= 59) countStar[5]++;
//				else if(num <= 69) countStar[6]++;
//				else if(num <= 79) countStar[7]++;
//				else if(num <= 89) countStar[8]++;
//				else if(num <= 99) countStar[9]++;
//			}else {
//				continue;
//			}
//		}
//		
//		for(int i = 0; i < countStar.length; i++) {
//			if(i == 0) {
//				System.out.printf(" 0 ~  9 : ");
//				for(int j = 0; j < countStar[i]; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}else {
//				System.out.printf("%d0 ~ %d9 : ", i, i);
//				for(int j = 0; j < countStar[i]; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
//		}
	}
}
