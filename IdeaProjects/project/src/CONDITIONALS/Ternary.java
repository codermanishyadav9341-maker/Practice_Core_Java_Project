package CONDITIONALS;

//import java.util.Scanner;
//
//public class Ternary {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your second number:- ");
//        int b = scan.nextInt();
//
//        String num = (a>b) ? "Minimum" : "Maximum";
//
//          System.out.print(num);
//    }
//}


// Questions no.2;

//import java.util.Scanner;
//
//public class Ternary{
//      public static void main(String[] args){
//
//          Scanner scan = new Scanner(System.in);
//
//          System.out.print("Enter your Years:- ");
//          int years = scan.nextInt();
//
//          String num = ((years%4==0) || (years%100==0) && (years%400==0)) ? "It is Leap Years" : "It is not Leap Years";
//
//          System.out.print(num);
//
//      }
//  }


// Questions no.3;

//import java.util.Scanner;
//
//public class Ternary{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        String num = ((a>b) || (b>a)) ? "Maximum" : "Minimum";
//
//         System.out.print(num);
//
//    }
//}


// Questions no. 4;

//import java.util.Scanner;
//
//public class Ternary{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//         if(num%2 != 0){
//             System.out.print("Odd Number");
//
//         }
//    }
//}


// Questions no .5;


import java.util.Scanner;

public class Ternary{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        int c = scan.nextInt();

        String num = ((a>b) && (b>c) || (c>a)) ? "Maximum" : "Minimum";

          System.out.print(num);



    }
}