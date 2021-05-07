package cokKatmanliMimari_HW.core;

import cokKatmanliMimari_HW.entities.concretes.User;

public interface GoogleServiceAdapter {
	void login(User user);
	void register(User user);
}
