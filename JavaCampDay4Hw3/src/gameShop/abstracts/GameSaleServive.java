package gameShop.abstracts;

import gameShop.entities.Customer;
import gameShop.entities.Game;

public interface GameSaleServive {
	void gameSale(Game game, Customer customer);
	void returnTheGame(Game game, Customer customer); //oyunu iade et metodu
}
