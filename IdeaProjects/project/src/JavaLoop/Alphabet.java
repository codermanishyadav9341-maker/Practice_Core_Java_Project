package JavaLoop;

import java.util.Scanner;

//public class Alphabet {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first Characters:- ");
//        char ch1 = scan.next().charAt(0);
//
//        System.out.print("Enter your Last Characters:- ");
//        char ch2 = scan.next().charAt(0);
//
//        while(ch1 >= ch2){
//            System.out.print(ch1 + " ");
//
//            ch1--;
//        }
//    }
//}


class Alphabet{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first Characters:- ");
        char ch1 = scan.next().charAt(0);

        System.out.print("Enter your last Characters:- ");
        char ch2 = scan.next().charAt(0);

        while(ch1 <= ch2){
            System.out.print(ch1+ " ");
            ch1++;
        }
    }
}