package com.shiristi.absdemos;

public class AccountCurrent extends Bank {

	public AccountCurrent(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		//super.deposit(amount);
		System.out.println("current deposit");
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("current withdraw");
		
	}

}
