package cokKatmanliMimari_HW.core;

import cokKatmanliMimari_HW.dataAccess.abstracts.UserDaoService;
import cokKatmanliMimari_HW.entities.concretes.User;
import cokKatmanliMimari_HW.toolGoogle.GoogleAuthenticationTool;

public class GoogleAuthAdapter implements GoogleServiceAdapter{
	GoogleAuthenticationTool googleRegister;
	UserDaoService userDao;
	
	

	public GoogleAuthAdapter(GoogleAuthenticationTool googleRegister, UserDaoService userDao) {
		super();
		this.googleRegister = googleRegister;
		this.userDao = userDao;
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google hesabi ile giris basarili :"+ user.getFirstName());
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		boolean a = googleRegister.register(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		if(a) {
			System.out.println("Kaydiniz Google ile olusturulmustur.");
			userDao.add(user);
		}
	}

}
