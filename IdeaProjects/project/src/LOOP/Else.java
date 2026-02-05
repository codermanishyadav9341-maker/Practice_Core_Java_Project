package LOOP;

//import java.util.Scanner;
//
//public class Else {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Starting point:- ");
//        int i = scan.nextInt();
//
//        System.out.print("Enter your Ending Point:- ");
//        int j = scan.nextInt();
//
//        while(i<=j){
//            if(i%5==0){
//                System.out.print(" " +i);
//            }
//            i++;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int first_digit = 0;
//        int last_digit = 0;
//
//
//
//        last_digit = num%10;
//
//        while(num >= 10){
//
//            num = num/10;
//        }
//        first_digit = num;
//
//        System.out.print("First_ digit :- " +first_digit);
//        System.out.print("\nLast_digit :- " +last_digit);
//
//
//    }
//}


//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int first_digit = 0;
//        int last_digit = 0;
//
//        last_digit = num%10;
//
//        while(num >= 10){
//
//            num = num/10;
//        }
//
//        first_digit = num;
//
//        System.out.print("First_digit:- " +first_digit);
//        System.out.print("\nlast_digit:- " +last_digit);
//
//    }
//}


// Questions no .3;

//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int max = 0;
//        int min = 9;
//        int digit;
//
//        while(num >= 10){
//
//            digit = num%10;
//
//            if(digit > max){
//                max = digit;
//            }
//             if(digit < min){
//                 min = digit;
//             }
//
//             num = num / 10;
//        }
//
//        System.out.print("Maximum:- " +max);
//        System.out.print("\nMinimum:- " +min);
//
//    }
//}


import java.util.Scanner;

public class Else{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       int i = 2;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int isPrime = 1;

        if(num < 2) {
            isPrime = 0;

            while (i * i <= num) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;

                }

                i++;
            }
        }
        if(isPrime==0){
            System.out.print("It is Prime number");
        }
         else{
             System.out.print("It is not Prime Number");
        }
    }
}