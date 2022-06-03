import java.util.Scanner;

import main.java.Account;
import main.java.AccountType;
import main.java.Transaction;
import main.java.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        User odhran = User.getUser();
        System.out.println(odhran.toString());
        Account savings = new Account(AccountType.SAVINGS, odhran);
        System.out.println(savings.toString());
        savings.setBalance(Transaction.deposit(input));
        System.out.println(savings.getBalance());
    }
}