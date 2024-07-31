package main.java;

import java.util.ArrayList;
import java.util.List;
public class User {
   private String username;
   private List<Account> accounts;
   public User(String username) {
       this.username = username;
       this.accounts = new ArrayList<>();
   }
   public void addAccount(Account account) {
       accounts.add(account);
   }
   // Getters and setters
public Object getUsername() {
    return accounts;

  
}
}