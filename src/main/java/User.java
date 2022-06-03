package main.java;

import java.util.Scanner;

public class User {


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

    
}
