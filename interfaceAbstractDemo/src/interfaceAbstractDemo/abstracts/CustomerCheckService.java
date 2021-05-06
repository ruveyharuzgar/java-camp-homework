package interfaceAbstractDemo.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer) throws RemoteException, Exception;
}

