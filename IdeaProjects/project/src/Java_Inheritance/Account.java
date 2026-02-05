package Java_Inheritance;

 class Account {
     double balance;

     Account(double balance){
         this.balance = balance;
     }

     public void ShowBalance(){
         System.out.println("Balance:- " +balance);
     }
}

class SavingAccount extends Account{
     double interestRate;

     SavingAccount(double balance, double interestRate){
         super(balance);
         this.interestRate = interestRate;
     }

     public void ShowBalance(){
         double updateBalance = balance+(balance*interestRate);
         System.out.println("Update Balance:- " +updateBalance);
     }

    public static void main(String[] args) {
        SavingAccount1 SA = new SavingAccount1(1000,0.05);

        SA.deposit();
    }
}
