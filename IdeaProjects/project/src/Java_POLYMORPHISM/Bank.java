package Java_POLYMORPHISM;

 class Bank {

     public double getInterestRate(){
         return 0;
     }
}

class SBI extends Bank{

     public double getInterestRate(){
         return 5.00;
     }
}

class HDFC extends Bank{

     public double getInterestRate(){
         return 6.00;
     }
}

class ICICI extends Bank{

     public double getInterestRate(){
         return 7.00;
     }

     public static void main(String[] args){

         ICICI ic = new ICICI();
         ic.getInterestRate();

         HDFC hd = new HDFC();
         hd.getInterestRate();

         SBI sb = new SBI();
         sb.getInterestRate();

         System.out.println("SBI Interest Rate:- " +ic.getInterestRate());
         System.out.println("HDFC Interest Rate:- " +hd.getInterestRate());
         System.out.println("SBI Interest Rate:- " +sb.getInterestRate());


     }
}
