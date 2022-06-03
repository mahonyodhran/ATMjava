package main.java;

import java.util.Scanner;

public class Transaction {

    public static double deposit(Scanner input) {
        double deposit;
        boolean valid;
        valid = false;
        deposit = 0;
        while (!valid) {
            try {
                System.out.print("How much would you like to deposit? ");
                deposit = Double.parseDouble(input.nextLine());
                if (deposit < 0) {
                    System.out.println("Please enter a value greater than 0");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        return deposit;
    }
    
}
