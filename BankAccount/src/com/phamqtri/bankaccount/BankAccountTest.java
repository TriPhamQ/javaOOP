package com.phamqtri.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount person1 = new BankAccount();
		BankAccount person2 = new BankAccount();
		
		person2.depositeCheckingBalance(5000);
		person2.withdrawCheckingBalance(260);
		person2.withdrawCheckingBalance(200);
		person1.depositeCheckingBalance(260);
		person1.depositeSavingBalance(200);
		
		System.out.println("Person 1");
		System.out.println("account number: " + person1.getAccountNumber());
		System.out.println("checking balance: " + person1.getCheckingBalance());
		System.out.println("saving balance: " + person1.getSavingBalance());
		System.out.println("total assets: " + person1.totalAssets());		
		System.out.println("Person 2");
		System.out.println("account number: " + person2.getAccountNumber());
		System.out.println("checking: " + person2.getCheckingBalance());
		System.out.println("saving: " + person2.getSavingBalance());
		System.out.println("total assets: " + person2.totalAssets());
		
	}
}
