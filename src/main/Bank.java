import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts = new HashMap<>();

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber);
        }
        else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void removeAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
        }
        else {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public boolean hasAccount(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }
}