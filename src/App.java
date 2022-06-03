import java.util.Scanner;

import main.java.Account;
import main.java.AccountType;
import main.java.Transaction;
import main.java.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        User user = User.getUser();
        Account savings = new Account(AccountType.SAVINGS, user);
        savings.setBalance(Transaction.deposit(input));
    }
}