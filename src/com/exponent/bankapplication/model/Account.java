package com.exponent.bankapplication.model;

public class Account {
	
	private int accountNumber;
	private String name;
	private String adharCardNumber;
	private String pancard;
	private long contact;
	private String email;
	private double accountBalance;  
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharCardNumber() {
		return adharCardNumber;
	}
	public void setAdharCardNumber(String adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	} 
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name" + name + ", adharCardNumber=" + adharCardNumber
				+ ", pancard=" + pancard + ", contact=" + contact + ", email=" + email + ", accountBalance="
				+ accountBalance + "]";
	}
	
	

}
//My first GitHub update
