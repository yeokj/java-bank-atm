public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addAccount(new Account("Alice Smith", "123456", "1234", 1000.00));
        bank.addAccount(new Account("Bob Johnson", "987654", "4321", 500.00));

        Machine machine = new Machine(bank);

        machine.welcome();
    }
}