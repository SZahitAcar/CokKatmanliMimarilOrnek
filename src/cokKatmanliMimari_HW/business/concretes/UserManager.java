package cokKatmanliMimari_HW.business.concretes;

import cokKatmanliMimari_HW.business.abstracts.AuthenticationService;
import cokKatmanliMimari_HW.business.abstracts.MailService;
import cokKatmanliMimari_HW.business.abstracts.UserService;
import cokKatmanliMimari_HW.dataAccess.abstracts.UserDaoService;
import cokKatmanliMimari_HW.entities.concretes.User;

public class UserManager implements UserService{

	private UserDaoService userDao;
	private AuthenticationService authentication;
	private MailService mail;
	
	public UserManager(UserDaoService userDao, AuthenticationService authentication, MailService mail) {
		super();
		this.userDao = userDao;
		this.authentication = authentication;
		this.mail = mail;
	}

	public UserDaoService getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoService userDao) {
		this.userDao = userDao;
	}

	public AuthenticationService getAuthentication() {
		return authentication;
	}

	public void setAuthentication(AuthenticationService authentication) {
		this.authentication = authentication;
	}

	public MailService getMail() {
		return mail;
	}

	public void setMail(MailService mail) {
		this.mail = mail;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		if(authentication.validation(user)) {
			userDao.add(user);
			System.out.println("Dogrulama kodunuz mail adresinize gonderildi.");
			System.out.println("Dogrulama kodunuz :" + mail.sendAnEmail());	
		}else {
			System.out.println("Kullanici bilgileri eksik veya hatali!");
		}
		

	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println("Sisteme giris basarili :"+ user.getFirstName());

	}

	@Override
	public void verification(User user,int code) {
		// TODO Auto-generated method stub
		
		if(mail.sendAnEmail() == code) {
			System.out.println("Mail dogrulamasi basarili :"+ user.getEmail());
		}else {
			System.out.println("Dogrulama kodu hatali!");
		}
		
	}

}
