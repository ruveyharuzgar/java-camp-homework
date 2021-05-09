package eCommerceProject.business.abstracts;

import eCommerceProject.core.concretes.User;

public interface AuthService {
	void login(User user);

	void register(User user) throws InterruptedException;

	void registerWithGoogle(User user);
}
