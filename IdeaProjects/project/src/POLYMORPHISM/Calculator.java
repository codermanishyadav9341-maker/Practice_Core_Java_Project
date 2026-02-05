package POLYMORPHISM;

class Calculator {

    void sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum of two number:- " +sum);
    }

    void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum of three:- " +sum);
    }

    public static void main(String[] args) {
         Calculator so = new Calculator();

         so.sum(20,10);
         so.sum(50 ,10,15);

    }
}
