package danS.AccountManagement;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {
	
	Service testService = new Service();
	
	@Test
	public void testAddAccount() {
		testService.addAccount("Daniel", "Smith", 5);
		assertEquals("Incorrect first name returned", testService.getAccounts().get(0).getFirstName(), "Daniel");
	}
	@Test
	public void testAddAccountTwo() {
		Account account = new Account("Daniel", "Smith", 5);
		testService.addAccount(account);
		assertEquals("Incorrect first name returned", testService.getAccounts().get(0).getFirstName(), "Daniel");
	}
	@Test
	public void testRemoveAccount() {
		testService.addAccount("Daniel", "Smith", 5);
		testService.removeAccount(0);
		assertEquals("account not removed", testService.getAccounts().get(0), null);
	}
	
	@Test
	public void testPrintAccountsEmpty() {
		testService.addAccount("Daniel", "Smith", 5);
		testService.removeAccount(0);
		assertEquals("incorrect string returned", testService.printAccounts(), "");
	}
	
	@Test
	public void testPrintAccountsPopulated() {
		testService.addAccount("Daniel", "Smith", 5);
		assertEquals("incorrect string returned", testService.printAccounts(), "Name: Daniel Smith\nAccount Number: 5\n");
	}

}
