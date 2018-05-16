package danS.AccountManagement;

public class MainClass {

	public static void main(String[] args) {
		
		Account newAccount = new Account("Daniel", "Smith", 11312);
		Service service = new Service();
		service.addAccount(newAccount);
		service.addAccount("George", "Hardy", 23432);
		service.printAccounts();
		

	}

}
