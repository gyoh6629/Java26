package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		TestAccountDao();
	}
	
	public static void TestAccountDao() {
		AccountDao adao = new AccountListDao();
		
		System.out.println(">>> 계좌 추가 및 계좌 목록");
		adao.save(new Account(11111111, "aaaa", "A", 10000));
		adao.save(new Account(12121212, "aAaA", "A", 90000));
		adao.save(new Account(22222222, "bbbb", "B", 20000));
		printAccountList(adao.findAll());
		
		System.out.println(">>> 계좌번호로 계좌 찾기");
		Account a = adao.findByNo(22222222);
		System.out.println(a);
		
		System.out.println(">>> 아이디로 계좌 찾기");
		printAccountList(adao.findByMemberId("A"));
		
		System.out.println(">>> 비밀번호 변경");
		a.setPassword("bBbB");
		adao.update(a);
		printAccountList(adao.findAll());
		
		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findByNo(11111111));
		printAccountList(adao.findAll());
	}
	
	public static void printAccountList(List<Account> alist) {
		for(Account a : alist) {
			System.out.println(a);
		}
	}
}
