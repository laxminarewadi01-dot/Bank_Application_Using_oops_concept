package com.exponent.bankapplication.controller;

import java.util.Scanner;

import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimpl.SBIImple;

public class AdminController {
	
	public static void main(String[] args) {
		System.out.println("====WELCOME TO SBI BANK===");
		System.out.println();
		Scanner scanner=new Scanner(System.in);
		boolean flag=true; //local var
		RBI rbi=new SBIImple(); //indirect object
		
		//menu
		while (flag) {
			System.out.println("Please choose an option from the menu to continue.");
			System.out.println("*******************************");
			System.out.println("|        Create Account        |");
			System.out.println("*******************************");
			System.out.println("|1 |create account             |  ");
			System.out.println("--------------------------------");
			System.out.println("|2 | Show account details      |");
			System.out.println("---------------------------------");
			System.out.println("|3 |show account Balance       |");
			System.out.println("---------------------------------");
			System.out.println("|4 | Deposit Money             |");
			System.out.println("---------------------------------");
			System.out.println("|5 |Withdraw Money             |");
			System.out.println("---------------------------------");
			System.out.println("|6 | Update Account Details    |");
			System.out.println("---------------------------------");
			System.out.println("|7 |Exit                       |");
			System.out.println(" *******************************");
			System.out.println("Please Enter Your choice in between 1 to 7....");
			
			int ch =scanner.nextInt();
			
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;
				
			case 2:
				rbi.showAccountDetails();
				break;
				
			case 3:
				rbi.showAccountBalance();
				break;
				
			case 4:
				rbi.depositMoney();
				break;
				
			case 5:
				rbi.withdrawMoney();
				break;
				
			case 6:
				rbi.updateAccountDetails();
				break;
				
			case 7:
				flag=false;
				break;

			default:
				System.out.println("Entered wrong choice please enter correct choice in between 1 to 7....!");
				break;
			}
		}
		System.out.println("Thank you for visiting...please visit again.....!");
		scanner.close();
		
		
		
	}

}
