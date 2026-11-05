package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.SHAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.SHMemberService;

public class SHConsoleBankApp {
	public static void main(String[] args) {
		
		MemberService ms = new SHMemberService(new MemberListDao());
		AccountService as = new SHAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}

}
