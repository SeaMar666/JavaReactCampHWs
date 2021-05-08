package business.concretes;

import Core.AuthService;
import Core.EmailValidator;
import business.abstracts.UserService;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        this.userDao = userDao;
        this.authService = authService;
    }


	@Override
	public void register(User user) {
		for (User  users : userDao.getAll()) {
			if(user.getMail().equals(user.getMail())) {
				System.out.println("Sistemde kayýtlý bir mail girdiniz , lütfen farklý mail kullanýn.");
				return;
			}
			
		}
		if(!EmailValidator.isValid(user.getMail())) {
			System.out.println("Mail uygun formatta deðildir.");
		}else if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad iki harften fazla olmalýdýr.");
	
		}else if(user.getPassword().length() < 6) {
			System.out.println("Parola 6 karakterden fazla olmalýdýr.");
		}else {
			userDao.register(user);
		}
		
	}

	@Override
	public void login(User user) {
		if(user.isItValid()) {
			userDao.login(user);
		}else {
			System.out.println("Giriþ baþarýsýz .");
		}
		
	}
	
	@Override
	public void confirmUser(User user) {
		userDao.confirmUser(user);
		
	}

	@Override
	public void registerWithYandex(User user) {
		user.setItValid(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithYandex(User user) {
		if(user.isItValid()) {
			this.authService.login(user);
		}else {
			System.out.println("Kayýt olmadan giriþ yapamazsýnýz !");
		}
		
		
	}
	




}
