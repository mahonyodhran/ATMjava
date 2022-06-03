package main.java;

import java.util.Scanner;
public class Transaction {

    public static double makeTransaction(Scanner input, String attribute) {
        double amount;
        boolean valid;
        valid = false;
        amount = 0;
        while (!valid) {
            try {
                System.out.print("How much would you like to "+attribute + "? ");
                amount = Double.parseDouble(input.nextLine());
                if (amount < 0) {
                    System.out.println("Please enter a value greater than 0");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        return amount;
    }
    
}
