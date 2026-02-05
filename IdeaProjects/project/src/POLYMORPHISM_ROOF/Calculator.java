package POLYMORPHISM_ROOF;

public class Calculator {
    public int add(int a , int b){
        int sum = (a+b);
        return sum;
    }

    public int add(int a,int b , int c){
        int sum = (a+b+c);
        return sum;
    }

    public static void main(String[] args){
        Calculator so = new Calculator();



        System.out.println("Sum of two number:- " +so.add(10,20));
        System.out.println("Sum of three number:- " +so.add(10,20,30));
    }
}
