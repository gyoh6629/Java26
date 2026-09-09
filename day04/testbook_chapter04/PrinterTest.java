package testbook_chapter04;

public class PrinterTest {
	public static void main(String[] args) {
//		Printer p = new Printer();
//		p.numOfPapers = 100;
//		p.print(70);
//		System.out.println(p.numOfPapers);
		
//		Printer p = new Printer(10);
//		p.print(2);
//		p.print(20);
//		p.print(10);
		
		Printer p = new Printer(20, true);
//		p.print(25); <- ??
		p.print(13);
		p.setDuplex(false);
		p.print(10);
	}	
}
