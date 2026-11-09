package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

	protected BankingMenu(AccountService as, MemberService ms) {
		super(as, ms);
		menuList = new String[] {"돌아가기", "입금", "출금"};
	}

	@Override
	public void run() {
		System.out.println("::: 뱅킹 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> A();
			case 2 -> B();
			case 0 -> {C(); return;}
			default -> System.out.println("!! 메뉴에 있는 번호를 선택 !!"); 
			}
		}
		
	}

	private void A() {
		System.out.println("::: 입금 :::");
	}

	private void B() {
		System.out.println("::: 출금 :::");
	}

	private void C() {
		System.out.println("::: 돌아가기 :::");
	}

}
