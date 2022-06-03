package main.java;

import java.util.Scanner;

public class AccountCreation {

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
