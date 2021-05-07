package cokKatmanliMimari_HW;

import java.util.Scanner;

import cokKatmanliMimari_HW.business.abstracts.UserService;
import cokKatmanliMimari_HW.business.concretes.AuthenticationManager;
import cokKatmanliMimari_HW.business.concretes.MailManager;
import cokKatmanliMimari_HW.business.concretes.UserManager;
import cokKatmanliMimari_HW.core.GoogleAuthAdapter;
import cokKatmanliMimari_HW.core.GoogleServiceAdapter;
import cokKatmanliMimari_HW.dataAccess.concretes.UserDao;
import cokKatmanliMimari_HW.entities.concretes.User;
import cokKatmanliMimari_HW.toolGoogle.GoogleAuthenticationTool;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		GoogleServiceAdapter googleTool = new GoogleAuthAdapter(
				new GoogleAuthenticationTool(),
				new UserDao()
				);
		
		UserService userManager = new UserManager(
				new UserDao(),
				new AuthenticationManager(),
				new MailManager()
				);
		User zahit = new User(1,"zahit","acar","zahit@gmail.com","asweqera");
		User zahit2 = new User(1,"zahit","acar","zahit@gmail.com","asweqera");
		User ahmet = new User(2,"ahmet","hamdi","ahmetH@hotmail.com","cucucu");
		
		googleTool.register(ahmet);
		userManager.register(zahit);
		userManager.register(zahit2);
		int code = scan.nextInt();
		userManager.verification(zahit, code);
		
	}

}
