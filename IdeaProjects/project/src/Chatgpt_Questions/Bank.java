package Chatgpt_Questions;

 class Bank {
     double balance;

     Bank(double balance){
         this.balance = balance;
     }

     public void showBalance(){
         if(balance >= 0){
             System.out.println("Balance:- " +balance);
         }
          else{
              System.out.println("Balance cannot be negative");
              this.balance = 0;
         }
     }

}

class SavingAccount extends Bank{
     double interestRate;

     SavingAccount(double balance,double interestRate){
         super(balance);
         this.interestRate = interestRate;
     }

     public void showBalance() {
         double interest = balance * interestRate;
         double updateBalance = balance + interest;

         System.out.println("Balance:- " + balance);
         System.out.println("Interest:- " + interest);
         System.out.println("Balance with Interest:- " + updateBalance);
     }

     public static void main(String[] args){
         SavingAccount ss = new SavingAccount(5000,0.005);
         ss.showBalance();
     }

 }

