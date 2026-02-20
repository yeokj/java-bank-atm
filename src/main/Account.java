public class Account {

    private String name;
    private String accountNumber;
    private String password;
    private double balance;

    public Account(String name, String accountNumber, String password, double balance) {
        UserValidator.validateName(name);
        UserValidator.validateAccountNumber(accountNumber);
        UserValidator.validatePassword(password);
        UserValidator.validateBalance(balance);

        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}