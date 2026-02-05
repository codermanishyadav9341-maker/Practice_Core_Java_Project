package Java_Encapsulations;

 class BankAccount {
     private String accountNumber;
     private String accountHolderName;
     private double balance;

//      Using Constructor
    BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("Amount:- " +amount+ " New Balance:- " +balance);
        }
         else{
             System.out.println("Amount Cannot be negative");
        }
    }

    public void withDraw(double amount){
        if(amount <0 ){
            System.out.println("No Withdraw");
        }
         else if(balance > balance){
             System.out.println("Insufficient Balance");
        }
          else{
              balance -= amount;
              System.out.println("WithDraw:- " +amount+ " | Sufficient Balance:- " +balance);
        }
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(BankAccount OtherAccount,double amount){
        if(amount < 0){
            System.out.println("No transfer");
        }
         else if(balance > balance){
             System.out.println("Insufficient Balance");
        }
         else{
             balance -= amount;
             System.out.println("Transfer amount:- " +amount+ " Sufficient Balance:- " +balance);
        }
    }

    public String getAccountInfo(){

      return "AccountHolderName:- " +accountHolderName+
              "\nAccount Number:- " +accountNumber;

    }

    public static void main(String[] args){
        BankAccount ba = new BankAccount("Accc89","Manish Yadav");
        BankAccount b1 = new BankAccount("Acc29","Ankit Yadav");
        ba.deposit(10000);
        ba.withDraw(1000);
       ba.transfer(b1,1000);

      System.out.println(ba.getAccountInfo());
    }
}
