package gameSimulation.business.adapters;

import java.rmi.RemoteException;

import gameSimulation.business.abstracts.CheckPersonService;
import gameSimulation.entities.Person;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckPersonService {

	@Override
	public boolean checkPerson(Person person) throws RemoteException, Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		return proxy.TCKimlikNoDogrula(Long.parseLong(person.getNationalIdentity()),
				person.getFirstName().toUpperCase(), person.getLastName().toUpperCase(),
				person.getDateOfBirth().getYear());
	}

}
