package eCommerceProject.core.concretes;

import eCommerceProject.core.abstracts.AuthenticationService;
import eCommerceProject.google.GoogleAuthOperationManager;

public class GoogleAuthOperationAdapter implements AuthenticationService {
	private GoogleAuthOperationManager operationService;

	public GoogleAuthOperationAdapter(GoogleAuthOperationManager operationService) {
		this.operationService = operationService;
	}

	public void login(User user) {
		operationService.login(user.getEmail(), user.getPassword());
	}
}
