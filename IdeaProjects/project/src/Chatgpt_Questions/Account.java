package Chatgpt_Questions;

 class Account {
     double balance;

     Account(double balance){
         this.balance = balance;
     }

     public void showBalance(){
         System.out.println("Balance:- " +balance);
     }
}

class CurrentAccount extends Account{
     double overDraftLimit;

     CurrentAccount(double balance,double overDraftLimit){
         super(balance);
         this.overDraftLimit = overDraftLimit;
     }

     public void withDraw(double amount){
         if(balance + overDraftLimit >= amount){
             balance = balance - amount;
             System.out.println("Withdrawal Successful");
             System.out.println("Remining Balance:- " +balance);
         }
          else{
              System.out.println("Limit exceed Transaction failed");
         }
     }

     public static void main(String[] args){
         CurrentAccount cc = new CurrentAccount(5000,6000);

         cc.withDraw(1200);
     }
}
