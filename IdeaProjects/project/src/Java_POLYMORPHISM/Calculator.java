package Java_POLYMORPHISM;

 class Calculator {

     public void add(int num1 ,int num2){
         int result = (num1+num2);
         System.out.println("Sum of two number:- " +result);
     }

     public void add(int num1,int num2,int num3){
         int result = (num1+num2+num3);
         System.out.println("Sum of three number:- " +result);
     }

     public static void main(String[] args){

         Calculator co = new Calculator();
         co.add(10,20);
         co.add(10,20,30);
     }
}
