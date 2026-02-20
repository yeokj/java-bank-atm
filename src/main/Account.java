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

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
        else  {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
}