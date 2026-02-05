package Encapsulations_Practice;

 class Calculators{
     private double result;

     Calculators(){
         this.result = 0;
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

     public void divide(double num){
         if(num != 0){
             result /= num;
         }
          else{
              System.out.println("Invalid");
         }
     }

     public double getResult(){
         return result;
     }

     public void clear(){
         result = 0;
     }


     public static void main(String[] args){

         Calculators so = new Calculators();

         so.add(10);
         so.add(20);

         System.out.println("Add:- " +so.getResult());


         so.sub(10);

         System.out.println("Subtract:- " +so.getResult());

         so.product(10);
         System.out.println("Multiply:- " +so.getResult());

         so.divide(10);
         System.out.println("Divided:- " +so.getResult());


     }
 }