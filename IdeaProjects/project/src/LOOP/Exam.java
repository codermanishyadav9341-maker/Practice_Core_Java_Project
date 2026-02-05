package LOOP;

import java.util.Scanner;

public class Exam {
     public static void main(String[] args){

         Scanner scan = new Scanner(System.in);

         System.out.println("Enter your number:- ");
         int num = scan.nextInt();

         for(int i = 1; i<=num; i++){
             for(int j = 1; j<=num; j++){
                 System.out.println(num);
             }
         }
     }
}
