package main.java;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Account> accounts;

    public User(){
        ///base constructor
        this.accounts = new ArrayList<>();
    }

    public User(String username) {
        this.username = username;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Getters and setters
    public Object getUsername() {
        return username;

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setUsername(String username){
        this.username = username;
    }


}