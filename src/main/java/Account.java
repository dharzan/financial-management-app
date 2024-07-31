package main.java;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected String accountId;
    protected String accountName;
    protected double balance;
    protected List<Transaction> transactions;
    public Account(String accountId, String accountName, double balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getType().equals("income")) {
            balance += transaction.getAmount();
        } else if (transaction.getType().equals("expense")) {
            balance -= transaction.getAmount();
        }
    }
    // Getters and setters
 }