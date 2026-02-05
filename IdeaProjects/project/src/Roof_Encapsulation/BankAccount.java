package Roof_Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite Successful");
        } else {
            System.out.println("Invalid Balance");
        }

    }

    public void withDraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("WithDraw Successful");
            System.out.println("Remainder Balance:- " +balance);
        }
         else{
             System.out.println("Invalid Balance We can not WithDraw");

        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountInfo(){
        return "Account Number:- " +accountNumber+
                "\nAccount Holder Name:- " +accountHolderName+
                "\nBalance:- " +balance;
    }

    public static void main(String[] args){
        BankAccount bb = new BankAccount("MONOP98","Manish Kumar");
        bb.deposit(5000);
        bb.withDraw(1000);
        System.out.println(bb.getAccountInfo());

    }
}



