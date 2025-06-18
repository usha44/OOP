// 9. You are developing a banking application that includes different types of accounts. Each account has a method named calculateInterest to calculate the interest based on the account type. Implement the calculateInterest method in the base class Account and override it in the derived classes SavingsAccount and FixedDepositAccount to calculate interest based on their specific rules. Write the code to demonstrate method overriding for calculating interest.
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.03;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount(10000),
            new FixedDepositAccount(20000)
        };

        for (Account a : accounts) {
            System.out.println("Interest: $" + a.calculateInterest());
        }
    }
}

