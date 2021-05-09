package eCommerceProject.core.concretes;

import java.util.Random;

import eCommerceProject.core.abstracts.MailSender;

public class MailSenderManager implements MailSender {
	Random rnd = new Random();

	public int generateVerificationCode() {
		int code = rnd.nextInt(9999);
		return code;
	}

	public int sendMail(String email) {
		int code = generateVerificationCode();
		System.out.println("Email : " + email + "\nVerification Code: " + code);
		return code;
	}
}
