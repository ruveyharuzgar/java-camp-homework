package gameSimulation.business.concretes;

import gameSimulation.business.abstracts.CampaignService;
import gameSimulation.entities.Person;

public class CampaignManager implements CampaignService {

	@Override
	public boolean winCampaign(Person person) {
		if (person.getDepartment().equals("öðrenci")) {
			System.out.println("You won a special campaign for students");
		}
		return false;
	}

	@Override
	public void addCampaign(Person person) {
		System.out.println("New campaign added");

	}

	@Override
	public void deleteCampaign(Person person) {
		System.out.println("Campaign deleted");

	}

	@Override
	public void updateCampaign(Person person) {
		System.out.println("Campaign updated");

	}

}
