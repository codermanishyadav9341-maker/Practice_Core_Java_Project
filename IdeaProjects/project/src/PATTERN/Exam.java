package PATTERN;

import java.util.Scanner;

//public class Exam{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        for(int i = 1; i<=num; i++){
//            for(int j = 1; j<=num; j++){
//                if((i+j)%2==0){
//                    System.out.print("* ");
//                }
//                 else{
//                     System.out.print("# ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// Questions no. 1;


public class Exam{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print("* #");
            }
            System.out.println();
        }
    }
}