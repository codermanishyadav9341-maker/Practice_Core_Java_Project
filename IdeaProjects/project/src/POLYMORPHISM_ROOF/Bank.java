package POLYMORPHISM_ROOF;

public class Bank {
    public double getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{
    public double getInterestRate(){
        return 5;
    }
}

class HDFC extends Bank{
    public double getInterestRate(){
        return 6;
    }
}

class ICICI extends Bank{
    public double getInterestRate(){
        return 7;
    }

    public static void main(String[] args){
        ICICI ic = new ICICI();
        System.out.println("ICICI Interest Rate:- " +ic.getInterestRate());

        HDFC hd = new HDFC();
        System.out.println("HDFC Interest Rate:- " +hd.getInterestRate());

        SBI sb = new SBI();
        System.out.println("SBI Interest Rate:- " +sb.getInterestRate());

    }
}
