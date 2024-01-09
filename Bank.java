import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    // Constructor
    public Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to accept deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

    // Constructor for Current Account
    public CurrAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = 1000; // Set minimum balance for current account
        this.serviceCharge = 50; // Set service charge for falling below minimum balance
    }

    // Method to check minimum balance and impose penalty if necessary
    private void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge imposed. Updated balance: " + balance);
        }
    }

    // Method to withdraw from current account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
            checkMinBalance();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class SavAcct extends Account {
    double interestRate;

    // Constructor for Savings Account
    public SavAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = 0.05; // Set interest rate for savings account
    }

    // Method to compute and deposit interest
    public void depositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest deposited. Updated balance: " + balance);
    }

    // Method to withdraw from savings account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        CurrAcct currentAccount = new CurrAcct("John Doe", 123456789, 1500);
        currentAccount.deposit(500);
        currentAccount.displayBalance();
        currentAccount.withdraw(1000);

        SavAcct savingsAccount = new SavAcct("Jane Doe", 987654321, 2000);
        savingsAccount.deposit(1000);
        savingsAccount.displayBalance();
        savingsAccount.depositInterest();
        savingsAccount.displayBalance();
        savingsAccount.withdraw(500);

        scanner.close();
    }
}

