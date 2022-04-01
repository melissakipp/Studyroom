package com.examples.exercises.section_8.SimpleBankingApp;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    /* So you can see how we're separating the data validation into the right areas, so we're not putting huge amounts
    of data validation in one spot. And this is one of the keys to object-orientated programming, to make sure that
    you're trying to validate only a specific thing in a specific area. And, therefore, your code is more compact and
    more along the lines of a black box functionality, and it's easy to maintain cuz it's fewer lines of code and just
    really easy to understand as well. */
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    /* The purpose of this method is to list all the customers for a given branch. And optionally, all the transactions
    for each customer. */
    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

class BankTestDrive {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created.");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Jonathan", 175.34);
        bank.addCustomer("Adelaide", "Tommy", 220.12);
        bank.listCustomer("Adelaide", false);

        System.out.println("============");

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Matthew", 44.22);
        bank.addCustomer("Sydney", "Brandon", 12.44);
        bank.addCustomer("Sydney", "Lissa", 1.65);
        bank.addCustomerTransaction("Sydney", "Matthew", 6.22);
        bank.addCustomerTransaction("Sydney", "Brandon", 41.84);
        bank.addCustomerTransaction("Sydney", "Lissa", 10.15);
        bank.listCustomer("Sydney", true);

        System.out.println("============");

        Bank chase = new Bank("JP Morgan");
        chase.addBranch("Chase Bank");
        chase.addCustomer("Chase Bank", "Lisa", 150.05);
        chase.addCustomer("Chase Bank", "Nancy", 275.34);
        chase.addCustomer("Chase Bank", "Stephanie", 320.12);
        chase.listCustomer("Chase Bank", false);
        chase.listCustomer("Chase Bank", false);

        /* We'll actually try sending some data through that's invalid. */
        if(!bank.addCustomer("Melbourne", "Brain", 5.53)) {
            System.out.println("Error Melbourne branch does not exists.");
        }

        /* We expect an error for trying to return a branch that already exists. */
        if(!bank.addBranch("Adelaide")) {
            System.out.println(bank.getBranches() + " branch already exists.");
        }

        /* non-existent customer */
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch.");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists.");
        }

    }
}
