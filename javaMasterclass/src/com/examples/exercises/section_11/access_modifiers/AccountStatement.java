package com.examples.exercises.section_11.access_modifiers;

public class AccountStatement {
    public static void main(String[] args) {

        BankAccount timAccount = new BankAccount("Tim");
        timAccount.bankDeposit(1000);
        timAccount.accountWithdrawal(200);
        timAccount.accountWithdrawal(-200);
        timAccount.bankDeposit(-20);
        timAccount.calculatedBalance();

        System.out.println("Balance on account is $" + timAccount.getAccountBalance());

    }
}
