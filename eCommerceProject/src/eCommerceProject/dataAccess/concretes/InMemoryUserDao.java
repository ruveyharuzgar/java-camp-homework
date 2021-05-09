package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Arrays;

import eCommerceProject.core.concretes.User;
import eCommerceProject.dataAccess.abstracts.UserDao;

public class InMemoryUserDao implements UserDao {
	static ArrayList<User> users = new ArrayList<User>(
			Arrays.asList(new User(1, "Rüveyha", "Rüzgar", "ruveyharuzgar.108@gmail.com", "12345")));

	public User add(User user) {
		users.add(user);
		return user;
	}

	public User getById(int id) {

		User selectedUser = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		return selectedUser;
	}

	public User getByMail(String email) {

		User selectedUser = users.stream().filter(u -> u.getEmail().equals(email)).findAny().orElse(null);
		return selectedUser;
	}

	@Override
	public boolean userExists(String email) {
		User selectedUser = users.stream().filter(e -> e.getEmail().equals(email)).findFirst().orElse(null);
		if (selectedUser != null) {
			return true;
		}
		return false;
	}
}
