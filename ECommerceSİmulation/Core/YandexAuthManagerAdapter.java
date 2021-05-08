package Core;

import Logger.YandexAuthManager;
import entities.concretes.User;

public class YandexAuthManagerAdapter implements AuthService{
	YandexAuthManager yandexAuthManager;

	public YandexAuthManagerAdapter(YandexAuthManager yandexAuthManager) {
		this.yandexAuthManager = yandexAuthManager;
	}

	@Override
	public void register(User user) {
		yandexAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		yandexAuthManager.login(user);
		
	}
	
	
	

}
