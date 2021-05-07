package gameSimulation.business.concretes;

import java.rmi.RemoteException;

import gameSimulation.business.abstracts.CheckPersonService;
import gameSimulation.business.abstracts.PersonService;
import gameSimulation.entities.Person;

public class PersonManager implements PersonService {

	CheckPersonService checkPersonService;

	public PersonManager(CheckPersonService checkPersonService) {
		this.checkPersonService = checkPersonService;
	}

	@Override
	public void add(Person person) {
		try {
			if (checkPersonService.checkPerson(person)) {
				System.out.println("Record created : " + person.getFirstName());
			}
			else {
				System.out.println("Check your information!\nAuthentication error");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Person person) {
		System.out.println("Record deleted : " + person.getFirstName());

	}

	@Override
	public void update(Person person) {
		System.out.println("Member information updated ");

	}

}
