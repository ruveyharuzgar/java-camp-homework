package gameSimulation;

import java.time.LocalDate;

import gameSimulation.business.abstracts.PersonService;
import gameSimulation.business.abstracts.SalesService;
import gameSimulation.business.adapters.MernisServiceAdapter;
import gameSimulation.business.concretes.CampaignManager;
import gameSimulation.business.concretes.PersonManager;
import gameSimulation.business.concretes.SalesManager;
import gameSimulation.entities.Person;

public class Main {

	public static void main(String[] args) {
		PersonService personService=new PersonManager(new MernisServiceAdapter() );
		Person person=new Person(1,"Rüveyha","Rüzgar","22222222222",LocalDate.of(1996, 9, 4),"öðrenci");
		personService.add(person);
		
		SalesService salesService=new SalesManager(new CampaignManager());
		salesService.sellGame(person);
	}

}
