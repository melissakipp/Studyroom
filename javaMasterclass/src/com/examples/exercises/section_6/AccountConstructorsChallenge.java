package com.examples.exercises.section_6;

/*
* Create a new class for a bank account
* Create fields for the account number, balance, customer name, email and phone number.
*
* Create getters and setters for each field
* Create two additional methods:
* 1. To allow the customer to deposit funds (this should increment the balance field).
* 2. To allow the customer to withdrawal funds. This should deduct from the balance field,
* but not allow the withdrawal to complete if there is an insufficient funds.
* Confirm your code is working.
* Add some System.out.println's in the two methods above as well.
* */

public class AccountConstructorsChallenge {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // Constructor 
    public AccountConstructorsChallenge(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        // to show that this was executed
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Note: it was completely necessary to put the 'this' on accountBalance, but being consistent is best practice.
    public void deposit(double depositAmount) {
        // += will add to the balance, if you assigned it would replace the balance
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed.");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }


    }
}

class AccountConstructorsChallengeTestDrive {
    public static void main(String[] args) {

        // Using constructors when creating a new object
        System.out.println("===========");
        AccountConstructorsChallenge elisabethAccount = new AccountConstructorsChallenge(
                "123456",
                500.12,
                "Elisabeth Kipp",
                "elisabeth@aol.com",
                "(602) 555-5555"
                );
        System.out.println("Customer's Name: " + elisabethAccount.getCustomerName());
        System.out.println("Current Balance: " + elisabethAccount.getAccountBalance());
        elisabethAccount.withdrawal(100.0);
        elisabethAccount.deposit(141.51);
        elisabethAccount.withdrawal(106.02);

    }
}
