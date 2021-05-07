package cokKatmanliMimari_HW.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cokKatmanliMimari_HW.business.abstracts.AuthenticationService;
import cokKatmanliMimari_HW.entities.concretes.User;

public class AuthenticationManager implements AuthenticationService{
	private String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	private Pattern pattern = Pattern.compile(regex);
	
	@Override
	public boolean validation(User user) {
		// TODO Auto-generated method stub
		if (isMailValidate(user) && isNameValidate(user) && isPassw0rdValidate(user)&& isEmailUnique(user)) {
			return true;
		}else {
			return false;
		}
			
	}
	
	 private boolean isMailValidate(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.find();
	}
	 private boolean isNameValidate(User user) {
		if(user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}else {
			return false;
		}
	}
	 private boolean isPassw0rdValidate(User user) {
		if (user.getPassword().length()>5) {
			return true;
		}else {
			return false;
		}
		
	}
	 private boolean isEmailUnique(User user) {
		 if(user.getEmail() != null) {
			 System.out.println("Bu mail ile sisteme daha once kayit yapilmistir");
			 return false;
		 }else {
			 return true;
		 }
	 }

}
