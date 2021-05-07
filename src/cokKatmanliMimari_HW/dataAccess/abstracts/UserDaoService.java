package cokKatmanliMimari_HW.dataAccess.abstracts;

import cokKatmanliMimari_HW.entities.concretes.User;

public interface UserDaoService {
	void add(User user);
	void delete(User user);
	void update(User user);
}
