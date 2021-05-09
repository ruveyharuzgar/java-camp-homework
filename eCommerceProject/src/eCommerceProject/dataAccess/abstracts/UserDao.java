package eCommerceProject.dataAccess.abstracts;

import java.util.List;

import eCommerceProject.core.concretes.User;

public interface UserDao {

	User add(User user);

	User getById(int id);

	User getByMail(String email);

	boolean userExists(String email);

}
