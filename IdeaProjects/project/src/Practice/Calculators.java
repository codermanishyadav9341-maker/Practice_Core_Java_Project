package Practice;

 class Calculators {

     public void add(int a,int b){
         int result = (a+b);
         System.out.println("Sum of 2 number:- " +result);
     }

     public void add(double a,double b){
         double sum = (a+b);
         System.out.println("Sum of 2 number:- " +sum);
     }

     public void add(int a , int b ,int c){
         int sum = (a+b+c);
         System.out.println("Sum of 3 number:- " +sum);
     }

     public static void main(String[] args) {

         Calculators c = new Calculators();
         c.add(10,20);
         c.add(10.2,20.5);
         c.add(10,20,30);
     }
}
