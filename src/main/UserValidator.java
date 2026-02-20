public class UserValidator {

    public static validateName(String name) {
        if (!name.matches("[a-zA-Z\\s'-]+")) {
            throw new IllegalArgumentException("Invalid name format");
        }
    }

    public static validateAccountNumber(String accountNumber) {
        if (!accountNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Account number must contain only digits");
        }
    }

    public static validatePassword(String password) {
        if (!password.matches("\\d{4}")) {
            throw new IllegalArgumentException("PIN must be exactly 4 digits");
        }
    }

    public static validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be positive");
        }
    }
}