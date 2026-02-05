package ROOF;

import java.util.Scanner;

//public class CONDITIONALS {
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


// Questions no. 2;

//public class CONDITIONALS{
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
//        if(a>b){
//            System.out.print("Maximum Number is " +a);
//        }
//         else{
//             System.out.print("Maximum number is " +b);
//        }
//    }
//}


// Questions no. 3;


//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num >= 0) {
//            if (num > 0) {
//                System.out.print("POSITIVE NUMBER");
//            }
//             else{
//                 System.out.print("ZERO");
//            }
//
//        }
//         else{
//             System.out.print("NEGATIVE NUMBER");
//        }
//    }
//}


//  Questions no. 4;


//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num%3==0){
//            System.out.print("Multiple by 3");
//        }
//         else{
//             System.out.print("It is not multiple by 3");
//        }
//    }
//}


//  Questions no. 5;

//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Leap Years:- ");
//        int years = scan.nextInt();
//
//        String result = ((years%4==0) || (years%100==0) && (years%400==0))  ? "leap Years" : "It is not Leap years";
//
//        System.out.print(result);
//    }
//}


// Questions no. 6;

//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if((num%3==0) && (num%5==0)){
//            System.out.print("It number is divisible by 3 or 5");
//        }
//         else{
//             System.out.print("It is not divisible by 3 or 5");
//        }
//
//    }
//}


// Questions no. 7;

//public class CONDITIONALS{
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        int max;
//
//        if(a>b){
//            max = a;
//        }
//         else{
//             max = b;
//        }
//
//         System.out.print("Maximum number is:- " +max);
//
//    }
//}


// Questions no. 8;


//public class CONDITIONALS{
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

// Questions no. 9;

//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num%2==0){
//            System.out.print( +num+ " is a Even number  ");
//        }
//         else{
//             System.out.print(+num +" is a Odd number " );
//        }
//
//    }
//}

// Questions no. 10;

//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Cost Price:- ");
//        float cost_Price = scan.nextInt();
//
//        System.out.print("Enter your Selling Price:- ");
//        float selling_Price = scan.nextInt();
//
//        float profit;
//        float loss;
//
//        if(selling_Price > cost_Price){
//            profit = (selling_Price - cost_Price);
//
//            System.out.print("Profit:- " +profit);
//        }
//         else{
//             loss = (cost_Price -  selling_Price);
//
//             System.out.print("Loss:- " +loss);
//        }
//    }
//}


//  Questions no. 11;

//public class CONDITIONALS{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Years:- ");
//        int years = scan.nextInt();
//
//        if(years%4==0){
//            if(years%100==0){
//                if(years%400==0){
//                    System.out.print(+years+ " is a Leap years");
//                }
//                 else{
//                     System.out.print(+years+ " is not a Leap Years");
//                }
//            }
//             else{
//                 System.out.print(+years+ " is a leap years");
//            }
//        }
//        else{
//            System.out.print(+years+ " is not a Leap Years");
//        }
//    }
//}


// Questions no. 12;

public class CONDITIONALS{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 1st angles:- ");
        int first_angle = scan.nextInt();

        System.out.print("Enter your 2nd angles:- ");
        int second_angle = scan.nextInt();

        System.out.print("Enter your 3rd angles:- ");
        int third_angle = scan.nextInt();

        int sum_of_all_sides = (first_angle + second_angle + third_angle);

        System.out.println("-----------------------------------------");

         if(sum_of_all_sides == 180){
             System.out.print("This triangle is valid");
         }
          else{
              System.out.print("This triangle is not valid");
         }
    }
}
