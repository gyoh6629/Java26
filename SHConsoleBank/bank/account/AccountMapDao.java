package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao {
	
	Map<Integer, Account> AccountDB = new HashMap<Integer, Account>();

	@Override
	public boolean save(Account a) {
		AccountDB.put(a.getNo(), a);
		return false;
	}

	@Override
	public List<Account> findAll() {
		if(!AccountDB.isEmpty()) {
			List<Account> alist = new ArrayList<Account>();
			for(Account a : AccountDB.values()) {
				alist.add(a);
			}
			return alist;
		}
		return null;
	}

	@Override
	public Account findByNo(int no) {
		return AccountDB.get(no);
	}

	@Override
	public List<Account> findByMemberId(String memberId) {
		List<Account> alist = new ArrayList<Account>();
		for(Account a : AccountDB.values()) {
			if(a.getMemberId() == memberId)
				alist.add(a);
		}
		return alist;
	}

	@Override
	public boolean update(Account a) {
//		return save(a);
		AccountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		AccountDB.remove(a);
		return true;
	}

}
