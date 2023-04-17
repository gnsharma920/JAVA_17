package com.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class UserAuthenticationByPredicate {

    public static void main(String[] args) {
        Predicate<User> predicate = user -> user.getUserName().equals("USER") && user.getPassword().equals("PASSWORD");
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        User user = new User(username, password);
        if (predicate.test(user)) {
            System.out.println("User Authenticated successfully");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}
