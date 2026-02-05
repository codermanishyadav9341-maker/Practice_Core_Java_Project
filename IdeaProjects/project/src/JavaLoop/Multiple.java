package JavaLoop;

import java.util.Scanner;

//public class Multiple {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your last number:- ");
//        int num2 = scan.nextInt();
//
////        int product = 1;
//
//        while(num1 <= num2){
//            if(num1%5 == 0){
//                System.out.print(num1+ " ");
//            }
//            num1++;
//        }
//    }
//}



class Multiple{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your last number:- ");
        int num2 = scan.nextInt();

        while(num1 <= num2){
            if(num1%5==0){
                System.out.print(num1+ " ");
            }
            num1++;
        }
    }
}