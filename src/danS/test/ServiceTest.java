package danS.test;

import static org.junit.Assert.*;

import org.junit.Test;

import danS.AccountManagement.Account;
import danS.AccountManagement.Service;

public class ServiceTest {
	
	Service testService = new Service();
	
	@Test
	public void testAddAccount() {
		testService.addAccount("Daniel", "Smith", 5);
		assertEquals("Incorrect first name returned", "Daniel", testService.getAccounts().get(0).getFirstName());
	}
	@Test
	public void testAddAccountTwo() {
		Account account = new Account("Daniel", "Smith", 5);
		testService.addAccount(account);
		assertEquals("Incorrect first name returned", "Daniel", testService.getAccounts().get(0).getFirstName());
	}
	@Test
	public void testRemoveAccount() {
		testService.addAccount("Daniel", "Smith", 5);
		testService.removeAccount(0);
		assertEquals("account not removed", null, testService.getAccounts().get(0));
	}
	
	@Test
	public void testPrintAccountsEmpty() {
		testService.addAccount("Daniel", "Smith", 5);
		testService.removeAccount(0);
		assertEquals("incorrect string returned", "", testService.printAccounts());
	}
	
	@Test
	public void testPrintAccountsPopulated() {
		testService.addAccount("Daniel", "Smith", 5);
		assertEquals("incorrect string returned", "Name: Daniel Smith\nAccount Number: 5\n", testService.printAccounts());
	}
	
	@Test
	public void testNumAccountsWithName() {
		testService.addAccount("Daniel", "Smith", 5);
		assertEquals("incorrect string returned", 1, testService.getAccountWithName("Daniel"));
	}
}
