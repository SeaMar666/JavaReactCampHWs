package Logger;

import entities.concretes.User;

public class YandexAuthManager {
	

	public void register(User user) {
		
		System.out.println(user.getFirstName() + " Yandex ile kayýt yapýldý.");
		
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " Yandex ile giriþ yapýldý.");

	}
	

}
