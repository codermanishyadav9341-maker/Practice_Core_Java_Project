package Java_Roof;

import java.util.Scanner;

public class Marks1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Marks:- ");
        int marks = scan.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        }
         else if(marks >= 75){
             System.out.println("Grade B");
        }
         else if(marks >= 50){
             System.out.println("Grade C");
        }
          else if(marks < 50){
              System.out.println("Grade f");
        }
    }
}
