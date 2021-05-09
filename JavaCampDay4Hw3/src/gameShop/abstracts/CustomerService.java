package gameShop.abstracts;

import gameShop.entities.Customer;

public interface CustomerService {
	void register(Customer customer);
	void deleteRecord(Customer customer);// kaydi sil metodu
	void updateProfile(Customer customer);
	
}
