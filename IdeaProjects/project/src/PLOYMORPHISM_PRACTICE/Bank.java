package PLOYMORPHISM_PRACTICE;

class Bank {
    int getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{
    double getInterestRate(double sBI_interest){
        return sBI_interest;
    }
}

class HDFC extends Bank{
    double getInterestRate(double hdfc_Interest){
        return hdfc_Interest;
    }
}

class ICI extends Bank{
    double getInterestRate(double ici_Interest){
        return ici_Interest;
    }

    public static void main(String[] args) {

        ICI c = new ICI();
        c.getInterestRate(6);
        c.getInterestRate();

        HDFC s = new HDFC();
        s.getInterestRate(6);

        SBI sb = new SBI();
        sb.getInterestRate(5);


        System.out.println("SBI Interest Rate:- " +sb.getInterestRate(5) +"%");
        System.out.println("HDFC Interest Rate:- " +s.getInterestRate(6) +"%");
        System.out.println("ICI Interest Rate:- " +c.getInterestRate(7) +"%");

    }
}
