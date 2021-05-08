package dataAccess.abstarcts;

import java.util.ArrayList;
import java.util.List;

import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
    private List<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<>();
	}

	@Override
	public void register(User user) {
		this.users.add(user);
		System.out.println("Kayýt olma baþarýlý : " + user.getMail() + "adresine gelen doðrulama linkine týklayýnýz.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		int userToDelete = this.users.indexOf(user);
		 this.users.remove(userToDelete);
		System.out.println("Kullanýcý silindi : " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void confirmUser(User user) {
		 System.out.println(user.getMail() + " : Mail adresi doðrulandý.");
	     user.setItValid(true);
		
	}

	@Override
	public void login(User user) {
		 System.out.println(user.getFirstName() + " : Kullanýcý giriþi baþarýlý.");
		
	}

}
