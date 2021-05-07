package gameSimulation.business.abstracts;

import gameSimulation.entities.Person;

public interface PersonService {
	void add(Person person);
    void delete(Person person);
    void update(Person person);
}
