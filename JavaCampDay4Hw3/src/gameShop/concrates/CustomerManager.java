package gameShop.concrates;

import gameShop.abstracts.CustomerService;
import gameShop.adapters.MernisServiceAdapter;
import gameShop.entities.Customer;

public class CustomerManager implements CustomerService{

	private MernisServiceAdapter mernisServiceAdapter;
	
	public CustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		this.mernisServiceAdapter = mernisServiceAdapter;
	}

	@Override
	public void register(Customer customer) {
		if(this.mernisServiceAdapter.checkIfRealPerson(customer)) {
			System.out.println("Musteri eklendi : " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.err.println("Musteri eklenmedi!");
		}
		
	}

	@Override
	public void deleteRecord(Customer customer) {
		System.out.println("Musteri silindi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void updateProfile(Customer customer) {
		System.out.println("Profil guncellendi : " + customer.getFirstName() + " " + customer.getLastName());		
	}

	

	

}
