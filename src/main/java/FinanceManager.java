package main.java;

import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private List<User> users;
    public FinanceManager() {
        this.users = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // or throw an exception if preferred
    }
    // Additional methods to handle accounts and transactions
 }