package Encapsulations_Practice;


class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = holderName;
        this.balance = 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        }
    }

    // Transfer method
    public void transfer(BankAccount otherAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } else if (amount > this.balance) {
            System.out.println("Transfer failed! Not enough balance.");
        } else {
            this.balance -= amount;
            otherAccount.balance += amount;
            System.out.println("Transferred ₹" + amount + " to " + otherAccount.accountHolderName);
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Account info
    public String getAccountInfo() {
        return "Account Number: " + accountNumber +
                "\nAccount Holder Name: " + accountHolderName;
    }

    public static void main(String[] args) {

        BankAccount so = new BankAccount("9341967541", "Manish Yadav");
        BankAccount s = new BankAccount("9229603198", "Ankit Kumar");

        so.deposit(10000);
        so.withdraw(5000);
        so.transfer(s, 500);

        System.out.println("Final Balance of Manish: " + so.getBalance());
        System.out.println("Final Balance of Ankit: " + s.getBalance());
    }
}

