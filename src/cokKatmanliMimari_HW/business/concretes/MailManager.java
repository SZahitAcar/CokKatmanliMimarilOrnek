package cokKatmanliMimari_HW.business.concretes;

import java.util.Random;

import cokKatmanliMimari_HW.business.abstracts.MailService;

public class MailManager implements MailService{
	
	int verificationCode;
	
	public  MailManager() {
		Random random = new Random();
		this.verificationCode= random.nextInt(1000);
	}
	@Override
	public int sendAnEmail() {
		// TODO Auto-generated method stub
		return this.verificationCode;
	}
	
}
