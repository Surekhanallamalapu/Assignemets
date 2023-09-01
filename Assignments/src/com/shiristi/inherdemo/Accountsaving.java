package com.shiristi.inherdemo;

public class Accountsaving extends Account {

	public Accountsaving(double balance) {
		super(balance);
	}

	@Override
	void withDraw(double amount) {
		//super.withDraw(amount);
		System.out.println("savingwithdraw");
	}

	@Override
	void deposit(double amount) {
		//super.deposit(amount);
		System.out.println("savingdeposit");
	}

	

}
