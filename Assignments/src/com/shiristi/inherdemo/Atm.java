package com.shiristi.inherdemo;

public class Atm {

	public static void main(String[] args) {
		Account saving=new Accountsaving(5000);
		saving.withDraw(1000);
		saving.deposit(3000);
		Account current=new AccountCurrent(2000);
		current.withDraw(2000);
		current.deposit(5000);
	}
}


