import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

   
    public Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

  
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

   
    public CurrAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = 1000; // Set minimum balance for current account
        this.serviceCharge = 50; // Set service charge for falling below minimum balance
    }

    private void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge imposed. Updated balance: " + balance);
        }
    }

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

   
    public SavAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = 0.05;
    }

   
    public void depositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest deposited. Updated balance: " + balance);
    }

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

