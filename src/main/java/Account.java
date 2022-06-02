package main.java;

import java.util.Scanner;

public class Account {
    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", balance= " + balance + "]";
    }

    static String createUserName(Scanner input) {
        String name;
        boolean valid;
        valid = false;
        name = "";
        while(!valid){
            try {
                System.out.print("What is your name? ");
                name = input.nextLine();
                if (name.equals("")) {
                    System.out.println("Please enter a value");
                } else {
                    valid = true;
                }
            } catch (NullPointerException e) {
                System.out.println("Please enter a name");
            }
        }
        return name;
    }

    static double getInitialDeposit(Scanner input) {
        double deposit;
        boolean valid;
        valid = false;
        deposit = 0;
        while (!valid) {
            try {
                System.out.print("What is your initial deposit? ");
                deposit = Double.parseDouble(input.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        return deposit;
    }
}
