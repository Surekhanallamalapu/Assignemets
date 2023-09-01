package com.shiristi.inherdemo;

public class AccountCurrent extends Account {

	public AccountCurrent(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw(double amount) {
		// TODO Auto-generated method stub
		//super.withDraw(amount);
		System.out.println("current withdraw");
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		//super.deposit(amount);
		System.out.println("current deposit");
	}

}
