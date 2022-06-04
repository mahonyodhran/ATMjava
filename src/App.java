import java.util.Scanner;

import main.java.ATM;
import main.java.Account;
import main.java.AccountType;
import main.java.User;

public class App {
    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
        User user = User.getUser();
        Account savings = new Account(AccountType.SAVINGS, user, 100.00);
        Account current = new Account(AccountType.CURRENT, user, 4000.00);
        user.getAccounts().add(savings);
        user.getAccounts().add(current);
        System.out.println(user.getAccounts());
        Scanner input = new Scanner(System.in);
        int choice=0, depositAmount = 0, withdrawalAmount = 0;
        boolean finished = false;

        atm.displayWelcomeMessage();
        while(!finished){
            atm.displayMenu();
            System.out.print("What would you like to do: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    savings.checkBalance();
                    break;
                case 2:
                    System.out.print("How much would you like to deposit: ");
                    depositAmount = input.nextInt();
                    savings.makeDeposit(depositAmount);
                    break;
                case 3:
                    System.out.print("How much would you like to withdraw: ");
                    withdrawalAmount = input.nextInt();
                    savings.makeWithdrawal(withdrawalAmount);
                    break;
                case 4:
                    input.close();
                    System.exit(0);
            }
        }
    }
}