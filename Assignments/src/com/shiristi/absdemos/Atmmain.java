package com.shiristi.absdemos;

public class Atmmain {

	public static void main(String[] args) {
		Bank bank=new Accountsaving(800);
		bank.deposit(700);
		bank.withdraw(300);
		
		bank=new AccountCurrent(900);
		bank.deposit(300);
		bank.withdraw(100);
	}

}
