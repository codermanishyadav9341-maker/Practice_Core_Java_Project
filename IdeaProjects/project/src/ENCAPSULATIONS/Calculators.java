package ENCAPSULATIONS;

class Calculators {
    private double result;

   public Calculators(){
       this.result = result;
   }


   public void add(double num){
       result += num;
   }

   public void sub(double num){
       result -= num;
   }

   public void product(double num){
       result *= num;
   }

   public void divided(double num){
       result /= num;
   }

   public double getResult(){
       return result;
   }
   public void clear(){
       result = 0;
   }

   public static void main(String[] args){

       Calculators c = new Calculators();

       c.add(10);
       c.sub(20);
       c.product(30);
       c.divided(40);
       c.clear();


       System.out.println("-------Final Results---------");
       System.out.println("Result:- " +c.getResult());


   }



}