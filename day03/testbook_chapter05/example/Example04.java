package testbook_chapter05;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url;
		while(true) {
			
			System.out.print("URL을 입력하세요 : ");
			url = sc.next();
			if(url.equals("bye")) break;
			String[] s = url.split("\\.");
			
			System.out.printf("%s은 '%s'으로 끝납니다.\n", url, s[s.length-1]);
			System.out.printf("%s은 '%s'를 포함합니다.\n", url, s[1]);
		}
		
	}
}
