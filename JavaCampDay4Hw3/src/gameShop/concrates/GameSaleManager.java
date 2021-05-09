package gameShop.concrates;

import gameShop.abstracts.GameSaleServive;
import gameShop.entities.Campaign;
import gameShop.entities.Customer;
import gameShop.entities.Game;

public class GameSaleManager implements GameSaleServive {
	
	private Campaign campaign;
	
	public GameSaleManager(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void gameSale(Game game, Customer customer) {
		System.out.println(game.getName() + " " + customer.getFirstName() + " " + customer.getLastName() 
		+ " Adli kisiye " + campaign.getName() + " ile satildi.");
		
	}

	@Override
	public void returnTheGame(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() 
		+ " Adli kisi " + game.getName() + " adli oyunu iade etti.");
		
	}

}
