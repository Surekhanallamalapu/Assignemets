package com.shiristi.inherdemo;

public class Accountsaving extends Account {

	public Accountsaving(double balance) {
		super(balance);
	}
	@Override
	void withdraw(double amount) {
		System.out.println(1000);
	}
	@Override
	void deposit(double amount) {
		System.out.println(700);
	}
}
