abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("Insufficient funds");
        }
    }
}
