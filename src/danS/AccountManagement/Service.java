package danS.AccountManagement;

import java.util.HashMap;

public class Service {
	
	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	private int nextID = 0;
	
	public void addAccount(Account accountToAdd) {
		accounts.put(nextID, accountToAdd);
		nextID++;
	}
	public void removeAccount(int id) {
		accounts.remove(id);
	}
	public HashMap<Integer, Account> getAccounts() {
		return accounts;
	}
	
}
