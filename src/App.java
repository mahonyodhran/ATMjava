import java.util.Scanner;

import main.java.Account;
import main.java.AccountType;
import main.java.Transaction;
import main.java.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        User user = User.getUser();
        Account savings = new Account(AccountType.SAVINGS, user, 100.00);
        Account current = new Account(AccountType.CURRENT, user, 500.00);
        savings.setBalance(savings.getBalance() + Transaction.makeTransaction(input, "deposit"));
        System.out.println(savings.getBalance());
        savings.setBalance(current.getBalance() - Transaction.makeTransaction(input, "withdraw"));
        System.out.println(current.getBalance());
    }
}