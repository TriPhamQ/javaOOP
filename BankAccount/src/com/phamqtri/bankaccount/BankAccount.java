package com.phamqtri.bankaccount;

public class BankAccount {
	private int accountNumber;
	private int checkingBalance;
	private int savingBalance;
	private static int numberOfAccounts;
	private static int amountStored;
	
	public BankAccount() {
		this.accountNumber = 100000 + numberOfAccounts;
		numberOfAccounts++;
	}
	
	public int getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public int getSavingBalance() {
		return this.savingBalance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public int getAmountStored() {
		return amountStored;
	}
	
	public void depositeCheckingBalance(int deposit) {
		this.checkingBalance += deposit;
		amountStored += deposit;
	}
	
	public void depositeSavingBalance(int deposit) {
		this.savingBalance += deposit;
		amountStored += deposit;
	}
	
	public void withdrawCheckingBalance(int withdraw) {
		if (this.checkingBalance < withdraw) {
			System.out.println("Insufficient fund");
		}
		else {
			this.checkingBalance -= withdraw;
			System.out.println("Withdrew " + withdraw + ", " + this.checkingBalance + " remain in checking balance.");
		}
	}
	
	public void withdrawSavingBalance(int withdraw) {
		if (this.savingBalance < withdraw) {
			System.out.println("Insufficient fund");
		}
		else {
			this.savingBalance -= withdraw;
			System.out.println("Withdrew " + withdraw + ", " + this.savingBalance + " remain in saving balance.");
		}
	}
	
	public int totalAssets() {
		return this.checkingBalance + this.savingBalance;
	}
}
