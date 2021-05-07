package cokKatmanliMimari_HW.entities.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cokKatmanliMimari_HW.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	
	public User(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			this.email = email;
			System.out.println("Mail kullanima uygundur.");
		}else {
			System.out.println("Uygun bir mail adresi giriniz.");
		}
		
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		if (password.length()>=6) {
			this.password = password;
			System.out.println("Parola basarili bir sekilde olusturuldu.");
		}else {
			System.out.println("Parola 6 karakterden az olamaz.");
		}
		
	}
}
