package main.java;

public class ATM {

    public ATM(){

    }
    public void displayWelcomeMessage(){
        System.out.println("Welcome to ATM Java!");
    }

    public void displayMenu(){
        System.out.println("1: Check balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
    }

    public boolean isValidOption(int choice){
        if(choice == 1 || choice == 2 || choice == 3 || choice == 4){
            return true;
        } 
        return false;
    }
}
