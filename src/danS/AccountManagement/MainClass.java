package danS.AccountManagement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {

	public static void main(String[] args) {
		
		Account newAccount = new Account("Daniel", "Smith", 11312);
		Service service = new Service();
		service.addAccount(newAccount);
		service.addAccount("George", "Hardy", 23432);
		System.out.println(service.printAccounts());
		
		String jsonInString = "";
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonInString = mapper.writeValueAsString(newAccount);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(jsonInString);
		
	}

}
