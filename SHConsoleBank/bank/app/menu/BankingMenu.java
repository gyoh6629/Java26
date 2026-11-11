package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

	protected BankingMenu(AccountService as, MemberService ms) {
		super(as, ms);
		menuList = new String[] {"돌아가기", "계좌 목록", "입금", "출금", "계좌 생성", "계좌 해지", "내 정보"};
	}

	@Override
	public void run() {
		System.out.println("::: 은행 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> A();
			case 2 -> B();
			case 3 -> C();
			case 4 -> D();
			case 5 -> E();
			case 6 -> F();
			case 0 -> {G(); return;}
			default -> System.out.println("!! 메뉴에 있는 번호를 선택 !!"); 
			}
		}
		
	}

	private void A() {
		System.out.println("::: 계좌 목록 :::");
	}

	private void B() {
		System.out.println("::: 입금 :::");
	}

	private void C() {
		System.out.println("::: 출금 :::");
	}

	private void D() {
		System.out.println("::: 계좌 생성 :::");
	}

	private void E() {
		System.out.println("::: 계좌 해지 :::");
	}

	private void F() {
		System.out.println("::: 내 정보 :::");
	}

	private void G() {
		System.out.println("::: 돌아가기 :::");
	}

}
