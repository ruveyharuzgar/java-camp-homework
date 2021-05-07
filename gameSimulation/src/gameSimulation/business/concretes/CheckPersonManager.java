package gameSimulation.business.concretes;

import java.rmi.RemoteException;

import gameSimulation.business.abstracts.CheckPersonService;
import gameSimulation.entities.Person;

public class CheckPersonManager implements CheckPersonService {

	@Override
	public boolean checkPerson(Person person) throws RemoteException, Exception {
		return true;
	}

}
