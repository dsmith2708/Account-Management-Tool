package danS.AccountManagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Service {
	
	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	private int nextID = 0;
	
	public void addAccount(Account accountToAdd) {
		accounts.put(nextID, accountToAdd);
		nextID++;
	}
	public void addAccount(String firstName, String lastName, int accountNumber) {
		accounts.put(nextID, new Account(firstName, lastName, accountNumber));
		nextID++;
	}
	public void removeAccount(int id) {
		accounts.remove(id);
	}
	public HashMap<Integer, Account> getAccounts() {
		return accounts;
	}
	public String printAccounts() {
		String returnString = "";
		Set set = accounts.entrySet();
		Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	    	Map.Entry mentry = (Map.Entry)iterator.next();
	    	returnString += mentry.getValue().toString();
	    }
	    return returnString;
	}
	
}
