package gameShop.abstracts;

import gameShop.entities.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void uptadeCampaign(Campaign campaign);
}
