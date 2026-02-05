package Java_Inheritance_Roof;

public class Account {
    double balance;

    Account(double balance){
        this.balance = balance;
    }

    public void showBalance(){
        System.out.println("Balance:- " +balance);
    }
}

class SavingAccount extends Account{
    double interestRate;

    SavingAccount(double balance,double interestRate){
            super(balance);
            this.interestRate = interestRate;
    }

    public void showBalance(){

        double updateBalance = balance+(balance*interestRate);
        System.out.println("Balance:- " +balance);
        System.out.println("Balance With InterestRate:- " +updateBalance);
    }

    public static void main(String[] args){
        SavingAccount ss = new SavingAccount(1000,0.05);
        ss.showBalance();

    }
}
