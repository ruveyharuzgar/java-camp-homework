package eCommerceProject.business.abstracts;

import eCommerceProject.core.concretes.User;

public interface UserService {
	User getById(int id);

	User getByEmail(String email);

	User add(User user);

	boolean userExists(String email);
}
