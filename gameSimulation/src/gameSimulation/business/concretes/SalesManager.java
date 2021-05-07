package gameSimulation.business.concretes;

import gameSimulation.business.abstracts.CampaignService;
import gameSimulation.business.abstracts.SalesService;
import gameSimulation.entities.Person;

public class SalesManager implements SalesService {
	CampaignService campaignService;
	
	public SalesManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	@Override
	public void sellGame(Person person) {
		if(campaignService.winCampaign(person)) {
			System.out.println("Special offer price for student\nSales successful : "+person.getFirstName());
		}
		else {
			System.out.println("Sales successful : "+person.getFirstName());
		}
	}

}
