package business.abstracts;

import entities.concretes.User;


public interface UserService {

    void register(User user);
    void login(User user);
    void confirmUser(User user);
    void registerWithYandex(User user);
    void loginWithYandex(User user);
	

}
