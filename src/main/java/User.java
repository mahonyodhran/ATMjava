package main.java;

import java.util.ArrayList;

public class User {
    private static User singleUser = null;
    int uuid;
    String firstName;
    String lastName;
    String email;
    ArrayList<Account> accounts;

    private User() {
        uuid = 1;
        firstName = "John";
        lastName = "Doe";
        email = firstName + lastName + "@atm.com";
        accounts = new ArrayList<>();
    }

    public static User getUser(){
        if (singleUser == null){
            singleUser = new User();
        }
        return singleUser;
    }

    public int getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "User [accounts=" + accounts + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
                + ", uuid=" + uuid + "]";
    }

}
