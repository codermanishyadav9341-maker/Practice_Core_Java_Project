package CONDITIONALS;

//import java.util.Scanner;
//
//public class Else {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num%2==0){
//            System.out.print("Even number");
//        }
//         else{
//             System.out.print("Odd number");
//        }
//    }
//}


// Questions no. 1;

//import java.util.Scanner;
//
//public class Else{
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
//        if(a>b){
//            System.out.print("A is Maximum");
//        }
//         else if(b > a){
//            System.out.print("B is Maximum");
//
//        }
//    }
//}



// Questions no.2;

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
//        if(num >= 0){
//            if(num>0){
//                System.out.print("Positive");
//            }
//             else{
//                 System.out.print("Zero");
//            }
//        }
//         else{
//             System.out.print("Negative");
//        }
//    }
//}


// Questions no. 3;


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
//        if(num%3==0){
//            System.out.print("Multiple of 3:- ");
//        }
//         else{
//             System.out.print("It is not Multiple of 3:- ");
//        }
//    }
//}


// Questions no.4;


//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Years:- ");
//        int years = scan.nextInt();
//
//
//
//      String result = ((years%4==0) || (years%100==0) && (years%400==0)) ? "Leap Years" : "Not Leap years";
//
//               System.out.print(result);
//    }
//}



// Questions no.5;

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
//        if((num%3==0) && (num%5==0)){
//            System.out.print("It is divisible by 3 or 5");
//        }
//         else{
//             System.out.print("It is not divisible by 3 or 5");
//        }
//    }
//}


// Questions no . 6;

//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        if(a>b){
//            System.out.print("A is Maximum");
//        }
//         else if(b > a){
//             System.out.print("B is Maximum");
//        }
//    }
//}

// Questions no. 7;

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
//        if((num%5==0) && (num%11==0)){
//            System.out.print("It is divisible by 5 or 11");
//        }
//         else{
//             System.out.print("It is not divisible by 5 or 11");
//        }
//    }
//}


// Questions no. 8;


//import java.util.Scanner;
//
//public class Else{
//     public static void main(String[] args){
//
//         Scanner scan = new Scanner(System.in);
//
//         System.out.print("Enter your number:- ");
//         int num = scan.nextInt();
//
//         String result = (num%2==0) ? "Even" : "Odd";
//
//         System.out.print(result);
//
//     }
// }

// Questions no.9;

//import java.util.Scanner;
//
//public class Else{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Cost Price:- ");
//        int cost_Price = scan.nextInt();
//
//        System.out.print("Enter your Selling Price:- ");
//        int selling_Price = scan.nextInt();
//
//        int profit = (selling_Price - cost_Price);
//
//        if(profit > 0){
//            System.out.print("Profit");
//        }
//         else{
//             System.out.print("Loss");
//        }
//    }
//}


// Questions no.10;


import java.util.Scanner;

public class Else{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first angle:- ");
        int angle_1 = scan.nextInt();

        System.out.print("Enter your Second angle:- ");
        int angle_2 = scan.nextInt();

        System.out.print("Enter your Third angle:- ");
        int angle_3 = scan.nextInt();

        int result = (angle_1 + angle_2 + angle_3);

        if(result == 180){
            System.out.print("It is valid for Triangle");
        }
         else{
             System.out.print("It is not valid for triangle");
        }
    }
}