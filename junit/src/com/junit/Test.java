package com.junit;

public class Test {
	public static void main(String args[]) {
        BankAccount acct = new BankAccount();
        System.out.println("Current balance : " + acct.balance());
        System.out.println("Withdrawing 20000");
        acct.withdraw(20000);
}
}