class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1234, 1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(5678, 500.0, 1000.0);
        System.out.println("Savings Account: ");
        System.out.println("Account Number: " + savingsAccount.accountNumber);
        System.out.println("Balance: " + savingsAccount.balance);
        System.out.println("Interest Rate: " + savingsAccount.interestRate);
        System.out.println("Checking Account: ");
        System.out.println("Account Number: " + checkingAccount.accountNumber);
        System.out.println("Balance: " + checkingAccount.balance);
        System.out.println("Overdraft Limit: " + checkingAccount.overdraftLimit);
    }
}
