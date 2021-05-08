package dataAccess.concretes;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	void confirmUser(User user);
	

}
