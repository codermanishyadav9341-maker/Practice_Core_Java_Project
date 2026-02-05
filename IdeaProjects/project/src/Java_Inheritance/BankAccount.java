package Java_Inheritance;

 class BankAccount {
     double balance;

     BankAccount(double balance){
         this.balance = balance;
     }

     public void displayBalance(){
         System.out.println("Initial Balance:- " +balance);
     }
}

class SavingAccount1 extends BankAccount{
     double deposite;

     SavingAccount1(double balance, double deposite){
         super(balance);
         this.deposite = deposite;
     }

     public void deposit(){

         System.out.println("Deposite:- " +deposite);

         double updateBalance = balance + deposite;
         System.out.println("New Balance:- " +updateBalance);
     }

     public static void main(String[] args){
         SavingAccount1 so = new SavingAccount1(1000,500);

         so.displayBalance();
         so.deposit();

     }
}
