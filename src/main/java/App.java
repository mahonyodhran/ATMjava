package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to ATMjava!");
        String name;
        double deposit;

        Scanner input = new Scanner(System.in);
        name = Account.createUserName(input);
        deposit = Account.getInitialDeposit(input);
        input.close();

        Account user = new Account(name, deposit);
        System.out.println(user.toString());
    }
}
