package gameShop.adapters;

import gameShop.abstracts.CustomerCheckService;
import gameShop.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
	
	//e-devlet dogrulamasi yapimi
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Dogrulandi.");
		return true;
	}

	

}
