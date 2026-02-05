package Encapsulations_Practice;

class BankAccount1{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

//     Using Constructors;

    BankAccount1(String accountNumber,String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit:- ₹" +amount+ "|    New Balance:- ₹" +balance);
        }
         else{
             System.out.println("Amount is not negative");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid Balance");
        }
         else if(amount > this.balance){
             System.out.println("Insufficient Balance");
        }
          else{
              balance -= amount;
              System.out.println("Withdraw:- ₹" +amount+  " |  Sufficient Balance:- ₹" +balance);
        }

    }

    public void transfer(BankAccount1 otherAccount, double amount){
        if(amount <= 0){
            System.out.println("No Transfer amount");
        }
         else if(amount > this.balance){
             System.out.println("Insufficient Balance");
        }
          else{
             balance -= amount;
             otherAccount.balance += amount;
              System.out.println("Transfer amount:- " +amount+ "  to " + otherAccount.accountHolderName);
        }
    }
     public double getBalance(){
        return balance;
     }

     public String getAccountInfo(){
        return " AccountNumber:- " +accountNumber+
                "AccountHolderName:- " +accountHolderName;
     }

     public static void main(String[] args){

        BankAccount1 so = new BankAccount1("Acc92","Manish Yadav");
        BankAccount1 s = new BankAccount1("Acc96","Ankit Kumar");
        so.deposit(10000);
        so.withdraw(5000);
        so.transfer(s,1000);

        System.out.println("AccountHolder Name:- " +so.accountHolderName);
        System.out.println("Final Amount:- " +so.getBalance());
        System.out.println("OtherAccountHolder Name:- " +s.accountHolderName);
        System.out.println("Final Amount:- " +s.getBalance());




     }
}

