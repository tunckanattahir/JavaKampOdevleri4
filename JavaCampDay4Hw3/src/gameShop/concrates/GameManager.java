package gameShop.concrates;

import gameShop.abstracts.GameService;
import gameShop.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + "  Sisteme eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " Sistemden silindi.");
		
	}

}
