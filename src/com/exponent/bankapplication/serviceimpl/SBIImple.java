package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class SBIImple implements RBI{
	
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();

	@Override
	public void createAccount() {
		System.out.println("Enter your accoun number:");
		int accNo =sc.nextInt();
		ac.setAccountNumber(accNo);
		System.out.println("Enter Your name:");
		String name=sc.next();
		ac.setName(name);
		System.out.println("Enter your Adharcard number:");
		ac.setAdharCardNumber(sc.next());
		System.out.println("Enter Your Pancard:");
		ac.setPancard(sc.next());
		System.out.println("Enter your email Id:");
		ac.setEmail(sc.next());
		System.out.println("Enter your contact number:");
		ac.setContact(sc.nextLong());
		System.out.println("Enter Account opening amount:");
		ac.setAccountBalance(sc.nextDouble());
		System.out.println("Account creation successfully..!");
	}

	@Override
	public void showAccountDetails() {
		System.out.println("Enter your account number to show your details:");
		int accountNumber=sc.nextInt();
		if (accountNumber==ac.getAccountNumber()) {
			System.out.println(ac);
			
			System.out.println(" __________________________________________________________________________________________________________________________");
			System.out.println(" |Account Number   |Name      |Adhar Number  |PancardNumber   |Contact    |    Email          | Account Balance          ");
			System.out.println(" |_________________|__________|______________|________________|___________|_________________  |___________________________");
			System.out.println(" |" +ac.getAccountNumber()+"             " +ac.getName()+"        " +ac.getAdharCardNumber()+"        "+ac.getPancard()+"        "+ac.getContact()+"        "+ac.getEmail()+"                "+ac.getAccountBalance()+" ");
			System.out.println(" |_________________|__________|______________|_______________ |_______________________________|___________________________|");
		}
		else {
			System.out.println("Account doesn't exist");
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Enter account number for show balance:");
		int accountNumber=sc.nextInt();
		if (accountNumber==ac.getAccountNumber()) {
			System.out.println("Your Balance is:" + ac.getAccountBalance());
		}
		else {
			System.out.println("Account doesn't exist");
		}
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter your amount:");
		double amount=sc.nextDouble();
		double withdrawMoney=2000;
		if (amount<=withdrawMoney) { 
			if (amount<=ac.getAccountBalance()) {
				double updateBalance=ac.getAccountBalance()-amount;
			     ac.setAccountBalance(updateBalance);
			System.out.println("Withdraw money successfully..!");
			System.out.println("Your available balance:"  +ac.getAccountBalance());
			}
		else {
			  System.out.println("Insufficient balance!");
	      }
		}
			else {
				System.out.println("maximmum withdrawal limit is 20000");
			
		}
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter your amount:");
		double amount=sc.nextDouble();
		double upadateBalance=ac.getAccountBalance()+amount;
		ac.setAccountBalance(upadateBalance);
		System.out.println("Deposit money successfully...!");
		System.out.println("Your available balance is:" +upadateBalance);
		
	}

	@Override
	public void updateAccountDetails() {
		System.out.println("Enter your account number:");
		int AccountNumber=sc.nextInt();
		if (AccountNumber==ac.getAccountNumber()) {
			System.out.println("1:Upadate Name");
			System.out.println("2:Upadate ContactNumber");
			System.out.println("3:Update Email");
			
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter new name:");
				sc.nextLine();
				String name=sc.next();
				ac.setName(name);
				System.out.println("Name update successfully..!");
				break;
				
			case 2:
				System.out.println("Enter new contact number:");
				sc.nextLine();
				int contactNo=sc.nextInt();
				ac.setContact(contactNo);
				System.out.println("Contact number update successfully..!");
				break;
				
			case 3:
				System.out.println("Enter new EmailId:");
				sc.nextLine();
				String email=sc.next();
				ac.setEmail(email);
				System.out.println("Email update successfully..!");
				break;

			default:
				break;
			}
		}
		
	}

}
