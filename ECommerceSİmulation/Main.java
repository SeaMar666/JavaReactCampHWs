import Core.YandexAuthManagerAdapter;
import Logger.YandexAuthManager;
import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.abstarcts.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		    UserService userService = new UserManager(new HibernateUserDao(), new YandexAuthManagerAdapter(new YandexAuthManager()));

	        User deniz = new User(1, "Deniz", "Aygün", "deniz@gmail.com", "230596");

	        User omer = new User(2, "Ömer", "Aksu", "omer@gmail.com", "160484");

	        User engin = new User(3, "Engin", "Demirog", "engin@engin.com", "171072");

	        User abc = new User(4, "ABC", "DEF", "abc@gmail.com", "240493");

	        userService.register(deniz);
	        userService.register(omer);
	        userService.confirmUser(deniz);
	        System.out.println("***********************************");
	        userService.register(engin);
	        userService.login(engin);
	        System.out.println("***********************************");
	        userService.confirmUser(engin);
	        userService.login(engin);
	        userService.login(deniz);
	        System.out.println("***********************************");
	        userService.loginWithYandex(abc);
	        userService.registerWithYandex(abc);
	        userService.loginWithYandex(abc);

	}

}
