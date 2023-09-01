package com.shiristi.absdemos;

public class Accountsaving extends Bank {

	
		public Accountsaving(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

		@Override
	void deposit(double amount) {
		//super.deposit(amount);
		System.out.println("savingdeposit");
	}

	@Override
	void withdraw(double amount) {
		System.out.println("saving withdraw");
	}

	

}
