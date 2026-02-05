package REPORTCARD;

import java.util.Scanner;

public class Result {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Physics_Marks:- ");
        int physics_Marks = scan.nextInt();

        System.out.print("Enter your Chemistry_Marks:- ");
        int chemistry_Marks = scan.nextInt();

        System.out.print("Enter your Mathematics_Marks:- ");
        int mathematics_Marks = scan.nextInt();

        System.out.print("Enter your Biology_Marks:- ");
        int biology_Marks = scan.nextInt();

        System.out.print("Enter your Computer_Marks:- ");
        int computer_Marks = scan.nextInt();

        double total_Marks = (physics_Marks + chemistry_Marks + mathematics_Marks + biology_Marks + computer_Marks);

        double percentage = (total_Marks / 500) * 100;

        System.out.println("               ");

        System.out.println("---------R E P O R T -  C A R D------------");

        System.out.println("               ");


        if(percentage >= 90){
            System.out.print("Grade A " +" Total Marks is " +total_Marks+ " Percentage " +percentage);
        }
        else if(percentage >= 80){
            System.out.print("Grade B " +" Total Marks is " +total_Marks+ " Percentage " +percentage);
        }
        else if(percentage >= 70){
            System.out.print("Grade C " +" Total Marks is " +total_Marks+ " Percentage " +percentage);
        }
        else if(percentage >= 60){
            System.out.print("Grade D " + " Total Marks is " +total_Marks+  " Percentage " +percentage);
        }
        else if(percentage >= 40){
            System.out.print("Grade E " + " Total Marks is "  +total_Marks+ " Percentage " +percentage);
        }
        else if(percentage <= 40){
            System.out.print("Grade F " + " Total Marks is " +total_Marks+ " Percentage " +percentage);
        }

    }
}


