class BankAccount {
    // Static variable
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Final variable
    final int accountNumber;

    // Instance variables
    String accountHolderName;
    double balance;

    // Constructor using 'this'
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aanya", 101, 5000);
        BankAccount acc2 = new BankAccount("Vedansh", 102, 10000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
