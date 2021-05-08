package business.concretes;

import business.abstracts.UserValidationService;
import entities.concretes.User;

public class ValidationManager implements UserValidationService {

	@Override
	public boolean verificate(User user) {
		System.out.println("Kullanýcý doðrulandý.");
		return true;
	}

}
