// Loanable interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Account
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String holder, double bal) {
        this.accountNumber = accNo;
        this.holderName = holder;
        this.balance = bal;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if (amt <= balance) balance -= amt; }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

// SavingsAccount
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.04; } // 4%
    @Override public void applyForLoan(double amt) { System.out.println("Savings Loan Applied: " + amt); }
    @Override public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

// CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String name, double bal) { super(acc, name, bal); }
    @Override public double calculateInterest() { return 0; } // No interest
    @Override public void applyForLoan(double amt) { System.out.println("Business Loan Applied: " + amt); }
    @Override public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}

// Main
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount(1001, "Alice", 10000),
            new CurrentAccount(2002, "Bob", 50000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            ((Loanable)acc).applyForLoan(10000);
            System.out.println("Loan Eligible? " + ((Loanable)acc).calculateLoanEligibility());
            System.out.println("------------------");
        }
    }
}
