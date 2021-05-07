package cokKatmanliMimari_HW.business.abstracts;

import cokKatmanliMimari_HW.entities.concretes.User;

public interface AuthenticationService {
	boolean validation(User user);
}
