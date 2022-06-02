package main.java;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Welcome to ATMjava!");

        Account a1 = new Account("Odhran", 100);
        System.out.println("Welcome: " + a1.getName() + "! \nYour current balance is: " + String.format("%.2f",a1.getBalance()));
    }
}
