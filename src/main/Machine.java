import java.util.Scanner;

public class Machine {
    Bank bank;
    Account account;
    Scanner scanner = new Scanner(System.in);

    public Machine(Bank bank) {
        this.bank = bank;
    }

    public void welcome() {
        System.out.println("Welcome to the Java ATM!");
        System.out.println("------------------------");
        account = insertCard();

        if (account != null) {
            if (verifyPassword(account)) {
                mainMenu();
            }
        }
    }

    public Account insertCard() {
        int cardAttempt = 0;

        while (cardAttempt < 3) {
            System.out.println("\nInsert your credit/debit card (input account number): ");
            String card = scanner.nextLine();
            if (bank.hasAccount(card)) {
               return bank.getAccount(card);
            }
            else {
                System.out.println("Please re-insert your card");
                ++cardAttempt;
            }
        }
        return null;
    }

    public boolean verifyPassword(Account account) {
        int passwordAttempts = 0;

        while (passwordAttempts < 3) {
            System.out.println("Enter your pin number: ");
            String password = scanner.nextLine();
            if (account.validatePassword(password)) {
                return true;
            }
            else {
                System.out.println("Please re-insert your pin number");
                ++passwordAttempts;
            }
        }
        return false;
    }

    public void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("---------");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            char choice = scanner.nextLine().charAt(0);

            switch (choice) {
                case '1': {
                    double depositAmount = 0.0;
                    boolean valid = false;

                    while (!valid) {
                        System.out.print("\nEnter deposit amount: ");
                        String deposit = scanner.nextLine();

                        try {
                            depositAmount = Double.parseDouble(deposit);
                            if (depositAmount > 0) {
                                valid = true;
                            }
                            else {
                                System.out.println("Invalid deposit amount");
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Invalid number. Try again.");
                        }
                    }

                    account.deposit(depositAmount);
                    System.out.println("\nDeposit successful.");
                    System.out.println("New balance: " + account.getBalance());
                    break;
                }
                case '2': {
                    double withdrawAmount = 0.0;
                    boolean valid = false;

                    while (!valid) {
                        System.out.print("\nEnter withdraw amount: ");
                        String withdraw = scanner.nextLine();

                        try {
                            withdrawAmount = Double.parseDouble(withdraw);
                            if (withdrawAmount > 0) {
                                valid = true;
                            }
                            else  {
                                System.out.println("Invalid withdraw amount");
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Invalid number. Try again.");
                        }
                    }
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdraw successful.");
                    }
                    else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                }
                case '3': {
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                }
                case '4': {
                    return;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}