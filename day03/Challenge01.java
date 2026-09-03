package testbook_chapter05;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		int numOfStudent = 0;
		int[] score;
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생 수? ");
		numOfStudent = in.nextInt();
		score = new int[numOfStudent];
		
		System.out.println(numOfStudent + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < numOfStudent; i++) {
			score[i] = in.nextInt();
		}
		
		System.out.println(numOfStudent + "명의 학생 성적은 다음과 같습니다.");
		for(int i = 0; i < numOfStudent; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
