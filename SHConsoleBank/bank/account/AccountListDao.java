package bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao {
	
	List<Account> AccountDB = new ArrayList<Account>();

	@Override
	public boolean save(Account a) {
		return AccountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		if(AccountDB.size() == 0) return null;
		List<Account> accounts = new ArrayList<Account>();
		for(Account a : AccountDB) {
			accounts.add(a);
		}
		return accounts;
	}

	@Override
	public Account findByNo(int no) {
		for(Account a : AccountDB) {
			if(a.getNo() == no)
				return a;
		}
		return null;
	}

	@Override
	public List<Account> findByMemberId(String memberId) {
		List<Account> accounts = new ArrayList<Account>();
		for(Account a : AccountDB) {
			if(a.getMemberId().equals(memberId))
				accounts.add(a);
		}
		if(accounts.size() == 0) return null;
		return accounts;
	}

	@Override
	public boolean update(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		AccountDB.remove(target);
		AccountDB.add(a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		return AccountDB.remove(target);
	}

}
