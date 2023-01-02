package de.zerocode;

public class IndianBank implements RBI {
	public double balance = 4500;

	@Override
	public double getBalance() {

		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(double amount) {
		if (balance > amount)
			balance = balance - amount;

	}

}
