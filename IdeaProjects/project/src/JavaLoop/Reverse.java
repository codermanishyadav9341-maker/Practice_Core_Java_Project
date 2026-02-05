package JavaLoop;

import java.util.Scanner;

//public class Reverse {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int reverse = 0;
//        int remainder = 1;
//
//        System.out.println("Before Reverse:- " +num);
//
//        while(num != 0){
//            remainder = num%10;
//            reverse = reverse * 10 + remainder;
//            num  = num/10;
//        }
//        System.out.println("Reverse number:- " +reverse);
//    }
//}






class Reverse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int reverse = 0;
        int remainder = 1;

        while(num != 0){
            remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }

        System.out.println("Reverse number:- " +reverse);

    }
}