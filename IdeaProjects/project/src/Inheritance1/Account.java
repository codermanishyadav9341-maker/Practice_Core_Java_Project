package Inheritance1;

//class Account{
//
//    double balance;
//    Account (double balance){        //    Using Constructors;
//        this.balance = balance;
//    }
//
//    void ShowBalance(){
//        System.out.println("Balance:-  ₹" +balance);
//    }
//}
//
//
//class ShavingAccount extends Account{
//
//    double interestRate;
//
//    ShavingAccount(double balance , double interestRate) {
//        super(balance);
//
//        this.interestRate = interestRate;
//    }
//
//    void ShowBalance(){
//        double updateBalance = balance + (balance * interestRate);
//        System.out.println("Balance with Interest:  ₹" +updateBalance);
//    }
//
//    public static void main(String[] args){
//
//
//        ShavingAccount s = new ShavingAccount(100,2);
//        Account a = new Account(100);
//        a.ShowBalance();
//        s.ShowBalance();
//
//    }
//}