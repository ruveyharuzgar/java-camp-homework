package eCommerceProject.core.abstracts;

public interface MailSender {
	int sendMail(String mail);
    int generateVerificationCode();
}
