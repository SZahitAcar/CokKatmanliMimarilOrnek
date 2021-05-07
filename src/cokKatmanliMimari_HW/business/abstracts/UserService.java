package cokKatmanliMimari_HW.business.abstracts;

import cokKatmanliMimari_HW.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void verification(User user, int code);
	
}
