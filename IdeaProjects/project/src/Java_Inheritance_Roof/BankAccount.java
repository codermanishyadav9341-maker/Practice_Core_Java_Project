package Java_Inheritance_Roof;

public class BankAccount {
    double initialBalance;

    BankAccount(double initialBalance){
        this.initialBalance = initialBalance;
    }

    public void displayBalance(){
        System.out.println("Balance:- " +initialBalance);
    }
}

class SavingAccount5 extends BankAccount{

    SavingAccount5(double initialBalance){
        super(initialBalance);
    }

    public void deposit(double balance){
       if(balance > 0 ) {

           initialBalance = initialBalance + balance;
          System.out.println("Deposited:- " +balance);
          System.out.println("New Balance:- " +initialBalance);
       }
        else{
            System.out.println("Invalid Balance");
       }

       }
      public static void main(String[] args) {
        SavingAccount5 ss = new SavingAccount5(5000);
        ss.displayBalance();
        ss.deposit(1000);
      }

}
