package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to ATMjava!");
        String name;
        double deposit;

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = "";
        try {
            name = input.nextLine();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        deposit = 0;
        System.out.println("What is your initial deposit?");
        try {
            deposit = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        input.close();

        Account user = new Account(name, deposit);
        System.out.println(user.toString());

        // Account a1 = new Account("Odhran", 100);
        // System.out.println("Welcome: " + a1.getName() + "! \nYour current balance is: " + String.format("%.2f",a1.getBalance()));
    }
}
