package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.abstracts.AuthenticationService;
import eCommerceProject.core.abstracts.MailSender;
import eCommerceProject.core.concretes.User;

public class AuthManager implements AuthService{
	private UserService userService;
	private MailSender mailSender;
	private AuthenticationService authenticationService;

	public AuthManager(UserService userService, MailSender mailSender) {
		this.userService = userService;
		this.mailSender = mailSender;
	}

	public AuthManager(UserService userService, MailSender mailSender, AuthenticationService authenticationService) {
		this.userService = userService;
		this.mailSender = mailSender;
		this.authenticationService = authenticationService;
	}

	@Override
	public void login(User user) {
		User loginUser= userService.add(user);
		if (loginUser != null){
			System.out.println("Logged in successfully.  -" + user.getFirstName());
		}
	}

	@Override
	public void register(User user) throws InterruptedException {
		User registerUser = userService.add(user);
		if (registerUser != null){
			int code=mailSender.sendMail(user.getEmail());
		}
	}

	@Override
	public void registerWithGoogle(User user) {

		User registerUser = userService.add(user);
		if (registerUser != null){
			int code=mailSender.sendMail(user.getEmail());
			authenticationService.login(user);
		}
	}
}
