package eCommerceProject.core.abstracts;

import eCommerceProject.core.concretes.User;

public interface AuthenticationService {
	void login(User user);
}
