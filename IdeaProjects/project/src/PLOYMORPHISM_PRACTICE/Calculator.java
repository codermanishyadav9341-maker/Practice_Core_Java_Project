package PLOYMORPHISM_PRACTICE;

//class Calculator {
//
//    int sum(int a, int b){
//        int c = a+b;
//        return c;
//    }
//
//    int sum(int a , int b, int c){
//        int d = (a+b+c);
//        return d;
//    }
//
//    public static void main(String[] args) {
//
//        Calculator so = new Calculator();
//
//
//        System.out.println("Sum of two number is:- " + so.sum(10,20));
//        System.out.println("Sum of three Number is:- " +so.sum(10,20,30));
//    }
//}


//                       or


import java.util.Scanner;

class Calculator{

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator so = new Calculator();

//            Two Parameters;

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second Number:- ");
        int b = scan.nextInt();

        int sum = so.sum(a,b);

        System.out.println("Sum of two Number:- " +sum);

//            Three Parameters;

        System.out.println("Enter your First number:- ");
        int x = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int y = scan.nextInt();

        System.out.print("Enter your Thirds Number:- ");
        int z = scan.nextInt();


        int sum1 = so.sum(x,y,z);

        System.out.println("Sum of Three Number:- " +sum1);

    }
}