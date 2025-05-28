public class Bankaccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String number) {
        accountNumber = number;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();
        account.setAccountNumber("12345");
        account.setAccountHolder("John Doe");
        account.deposit(1000);
        account.withdraw(200);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}
