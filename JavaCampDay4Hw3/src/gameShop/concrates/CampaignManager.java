package gameShop.concrates;

import gameShop.abstracts.CampaignService;
import gameShop.entities.Campaign;

public class CampaignManager implements CampaignService {
	

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " eklendi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " silindi.");
		
	}

	@Override
	public void uptadeCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " guncellendi.");
		
	}
	
}
