package JavaLoop;

import java.util.Scanner;

//public class Count1 {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int num2 = scan.nextInt();
//
//        int count = 0;
//
//        for(int i = num1; i<=num2; i++){
//            count++;
//        }
//        System.out.println("Two number between digits:- " +count);
//    }
//}




class Count1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        int count = 0;
        while(num1 <= num2){
            count++;
            num1++;
        }
        System.out.println("Count digits between two number:- " +count);
    }
}