package main.java;

public class Account {
    AccountType type;
    User holder;
    double balance;

    public Account(AccountType type, User holder, double balance) {
        this.type = type;
        this.holder = holder;
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }


    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Balance is " + getBalance());
    }

    public void makeDeposit(int depositAmount){
        setBalance(balance + depositAmount);
    }

    public void makeWithdrawal(int withdrawalAmount){
        if (withdrawalAmount > this.getBalance() && withdrawalAmount > 0.0){
            System.out.println("You cannot afford this withdrawal");
            return;
        }
        setBalance(balance - withdrawalAmount);
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", holder=" + holder.getUuid() + ", type=" + type + "]";
    }
    
}
