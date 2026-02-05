package LOOP;

//import java.util.Scanner;
//
//public class IF {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter Your Starting Point:- ");
//        int num1 = scan.nextInt();
//
//        int i = 1;
//
//        while(i < num1){
//             System.out.print(num1);
//        }
//    }
//}


//import java.util.Scanner;
//
//public class IF{
//      public static void main(String[] args){
//
//          Scanner scan = new Scanner(System.in);
//
//          System.out.print("Enter your first Character:- ");
//          char ch1 = scan.next().charAt(0);
//
//          System.out.print("Enter your last Characters:- ");
//          char ch2 = scan.next().charAt(0);
//
//
//          System.out.print("Alphabets(A to Z):- ");
//
//          while(ch1<=ch2){
//              System.out.print("  " +ch1);
//                ch1++;
//
//          }
//
//      }
//  }


// Questions no.2;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first Characters:- ");
//        char ch1 = scan.next().charAt(0);
//
//        System.out.print("Enter your last Characters:- ");
//        char ch2 = scan.next().charAt(0);
//
//        System.out.print("(Z to A) :- ");
//
//        while(ch1>=ch2){
//            System.out.print("  " +ch1);
//            ch1--;
//        }
//
//    }
//}

// Questions no. 3;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Starting Point:- ");
//        char ch1 = scan.next().charAt(0);
//
//        System.out.print("Enter your Ending Point:- ");
//        char ch2 = scan.next().charAt(0);
//
//        while(ch1>=ch2){
//            System.out.print("  " +ch1);
//             ch1--;
//
//        }
//    }
//}


// Questions no.4;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Even number:- ");
//
//        while(num1<=num2){
//
//            if(num1%2==0){
//                System.out.print(" " +num1);
//
//            }
//            num1++;
//        }
//
//    }
//}



// Questions no.5;


//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Odd Number:- ");
//
//         while(num1<=num2){
//             if(num1%2 != 0){
//                 System.out.print(" " +num1);
//             }
//             num1++;
//         }
//    }
//}


// Questions no. 6;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int i = 1;
//        int factorial = 1;
//
//        while(i<=num){
//
//            factorial *= i;
//            i++;
//        }
//        System.out.print(" " +factorial);
//
//    }
//}


// Questions no.7

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your base:- ");
//        int base = scan.nextInt();
//
//        System.out.print("Enter your Power:- ");
//        int power = scan.nextInt();
//
//        int result = 1;
//
//        while(power>0){
//
//            result *= base;
//            power--;
//        }
//        System.out.print(" " +result);
//    }
//}


// Questions no.8;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int reverse = 0;
//        int remainder = 1;
//
//        while(num != 0){
//
//            remainder = num%10;
//            reverse = reverse *10 + remainder;
//             num = num/10;
//
//        }
//        System.out.print(" " +reverse);
//    }
//}




// Questions no. 9;

import java.util.Scanner;

public class IF{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        int count = 0;

        while(num1<=num2){

           count++;
           num1++;
        }
        System.out.print(" " +count);
    }
}

