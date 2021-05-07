package cokKatmanliMimari_HW.dataAccess.concretes;

import cokKatmanliMimari_HW.dataAccess.abstracts.UserDaoService;
import cokKatmanliMimari_HW.entities.concretes.User;

public class UserDao implements UserDaoService {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanici eklendi :"+user.getFirstName() );
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanici silindi :"+user.getFirstName() );
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanici guncellendi :"+user.getFirstName() );
	}

}
