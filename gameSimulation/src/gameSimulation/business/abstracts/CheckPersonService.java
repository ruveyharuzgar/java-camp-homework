package gameSimulation.business.abstracts;

import java.rmi.RemoteException;

import gameSimulation.entities.Person;

public interface CheckPersonService {
	boolean checkPerson(Person person) throws RemoteException, Exception;
}
