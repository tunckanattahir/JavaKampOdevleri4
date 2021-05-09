package gameShop.abstracts;

import gameShop.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
