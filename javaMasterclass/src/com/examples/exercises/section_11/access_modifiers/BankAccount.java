package com.examples.exercises.section_11.access_modifiers;

import java.util.ArrayList;

public class BankAccount {

    private String accountName;
    private int accountBalance = 0;
    private ArrayList<Integer> accountTransactions;


    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountTransactions = new ArrayList<Integer>();
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void bankDeposit(int depositAmount) {
        if (depositAmount > 0) {
            accountTransactions.add(depositAmount);
            this.accountBalance += depositAmount;
            System.out.println("$" + depositAmount + " deposited. Balance is now $" + this.accountBalance);
        } else {
            System.out.println("Cannot deposit negative sums.");
        }
    }

    public void accountWithdrawal(int withdrawalAmount) {
        int withdrawal =- withdrawalAmount;
        if (withdrawal < 0 ) {
            this.accountTransactions.add(withdrawal);
            this.accountBalance += withdrawal;
            System.out.println("$" + withdrawalAmount + " withdrawal. Balance is now $" + this.accountBalance);
        } else {
            System.out.println("Cannot withdraw negative sums.");
        }
    }

    public void calculatedBalance() {
        this.accountBalance = 0;
        for (int i : this.accountTransactions) {
            this.accountBalance += i;
        }
        System.out.println("Current balance is $" + this.accountBalance);
    }
}
