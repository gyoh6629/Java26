package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminMemberMenu extends ConsoleMenu {

	protected AdminMemberMenu(AccountService as, MemberService ms) {
		super(as, ms);
		menuList = new String[] {"돌아가기", "회원목록", "회원강퇴"};
	}

	@Override
	public void run() {
		System.out.println("::: 회원관리 메뉴 :::");
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
		System.out.println("::: 회원목록 :::");
		
	}

	private void B() {
		System.out.println("::: 회원강퇴 :::");
	}

	private void C() {
		System.out.println("::: 돌아가기 :::");
	}

}
