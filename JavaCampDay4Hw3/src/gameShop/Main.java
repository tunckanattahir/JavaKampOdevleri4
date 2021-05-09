package gameShop;

import gameShop.adapters.MernisServiceAdapter;
import gameShop.concrates.CampaignManager;
import gameShop.concrates.CustomerManager;
import gameShop.concrates.GameManager;
import gameShop.concrates.GameSaleManager;
import gameShop.entities.Campaign;
import gameShop.entities.Customer;
import gameShop.entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"tahir","tunckanat","1950","00000000000");
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.register(customer);
		
		Game game = new Game(1247,"PES 2021",129.0);
		Game game1 = new Game(1248,"FIFA 2021",129.0);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.add(game1);
		
		Campaign campaign = new Campaign(4588,"Yeni Uye Kampamyasi",10.0);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		GameSaleManager gameSaleManager = new  GameSaleManager(campaign);
		gameSaleManager.gameSale(game, customer);
		
		
	}
	

}
