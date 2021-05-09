package eCommerceProject;


import eCommerceProject.business.concretes.AuthManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.concretes.GoogleAuthOperationAdapter;
import eCommerceProject.core.concretes.MailSenderManager;
import eCommerceProject.core.concretes.User;
import eCommerceProject.dataAccess.concretes.InMemoryUserDao;
import eCommerceProject.google.GoogleAuthOperationManager;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Rüveyha", "Rüzgar", "xxxx@gmail.com", "11111");
		

		AuthManager authManager = new AuthManager(new UserManager(new InMemoryUserDao()), new MailSenderManager(),
				new GoogleAuthOperationAdapter(new GoogleAuthOperationManager()));
		authManager.registerWithGoogle(user);
		
		//authManager.login(user);
	}
}
