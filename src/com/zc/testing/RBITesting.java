package com.zc.testing;

import de.zerocode.IndianBank;

public class RBITesting {

	public static void main(String[] args) {
		IndianBank bank = new IndianBank();
		System.out.println(bank.getBalance());
		bank.deposit(300);
		System.out.println(bank.getBalance());
		bank.withdraw(650);
		System.out.println(bank.getBalance());
	}

}
