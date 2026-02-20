public class UserValidator {

    public static boolean validateName(String name) {
        if (!name.matches("[a-zA-Z\\s'-]+")) {
            throw new IllegalArgumentException("Invalid name format");
        }
        return true;
    }

    public static boolean validateAccountNumber(String accountNumber) {
        if (!accountNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Account number must contain only digits");
        }
        return true;
    }

    public static boolean validatePassword(String password) {
        if (!password.matches("\\d{4}")) {
            throw new IllegalArgumentException("PIN must be exactly 4 digits");
        }
        return true;
    }

    public static boolean validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be positive");
        }
        return true;
    }
}