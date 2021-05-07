package gameSimulation.business.abstracts;

import gameSimulation.entities.Person;

public interface CampaignService {
	boolean winCampaign(Person person);
	void addCampaign(Person person);
	void deleteCampaign(Person person);
	void updateCampaign(Person person);
}
