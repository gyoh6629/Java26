package testbook_chapter07_example;

import java.util.Scanner;

public class EchoerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//익명클래스 안배움
		Echoer e = new Echoer() {
			@Override
			void echo() {
				String s = in.nextLine();
				System.out.println(s);
			}
		};
		
		e.start();
		e.echo();
		e.stop();
	}
}
