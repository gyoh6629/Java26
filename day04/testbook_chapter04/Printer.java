package testbook_chapter04;

class Printer {
//	int numOfPapers = 0;
	private int numOfPapers = 0;
	private boolean duplex;
	
//	public Printer() {
//	}
//	
//	public Printer(int Papers) {
//		numOfPapers = Papers;
//	}
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if(duplex) {
			System.out.print("양면으로 ");
		}else {
			System.out.print("단면으로 ");
		}
		if(numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		}else if(numOfPapers < amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount-numOfPapers, numOfPapers);
			numOfPapers = 0;
		}else {
			numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
		}
	}
}