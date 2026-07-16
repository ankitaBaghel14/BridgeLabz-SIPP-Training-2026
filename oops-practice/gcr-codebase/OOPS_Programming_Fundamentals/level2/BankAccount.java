class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountHolder = "Yuvraj";
        account.accountNumber = 12345;
        account.balance = 10000;

        account.displayBalance();
        account.deposit(2000);
        account.withdraw(5000);
        account.displayBalance();
    }
}