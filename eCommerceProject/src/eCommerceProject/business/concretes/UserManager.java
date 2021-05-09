package eCommerceProject.business.concretes;

import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.concretes.User;
import eCommerceProject.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {

		return this.userDao.getByMail(email);
	}

	@Override
	public User add(User user) {

		if (!emailIsCorrect(user.getEmail())) {
			System.out.println("Invalid email");
		}
		if (!checkfirstNameIsValid(user.getFirstName())) {
			System.out.println("Must be at least 2 characters");
		}
		if (!checkLastNameIsValid(user.getLastName())) {
			System.out.println("Must be at least 2 characters");
		}
		if (!checkPasswordIsValid(user.getPassword())) {
			System.out.println("Must be at least 6 characters");
		}

		if (userExists(user.getEmail())) {
			System.out.println("User already exists");
		} else {
			this.userDao.add(user);
		}

		return user;

	}

	private boolean emailIsCorrect(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

	private boolean checkfirstNameIsValid(String name) {
		if (name.length() <= 2) {
			return false;
		}
		return true;
	}

	private boolean checkLastNameIsValid(String lastName) {
		if (lastName.length() <= 2) {
			return false;
		}
		return true;
	}

	private boolean checkPasswordIsValid(String password) {
		if (password.length() <= 6 || password == null) {
			return false;
		} 
		return true;
	}

	@Override
	public boolean userExists(String email) {
		return this.userDao.userExists(email);
	}
}
