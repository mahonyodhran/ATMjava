package main.java;

import java.util.Scanner;

public class Transaction {

    static double getInitialDeposit(Scanner input) {
        double deposit;
        boolean valid;
        valid = false;
        deposit = 0;
        while (!valid) {
            try {
                System.out.print("What is your initial deposit? ");
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
