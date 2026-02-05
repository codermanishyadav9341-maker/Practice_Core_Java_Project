package CALCULATORS;

import java.util.Scanner;

public class Class {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first Number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second Number:- ");
        int b = scan.nextInt();

        System.out.print("Input:- +,-,*,/,%%:----");
        char ch = scan.next().charAt(0);

         switch(ch){

                 case '+':
                 int result = a+b;
                 System.out.print("Sum of a and b is:- " +result);
                 break;

                 case '-':
                 int sub = a-b;
                 System.out.print("Subtract of a and b is:- " +sub);
                 break;

                 case '*':
                 int multi = a*b;
                 System.out.print("Product of a and b is:- " +multi);
                 break;

                 case '/':
                 int divided = a/b;
                 System.out.print("Divided of a and b is:- " +divided);
                 break;

             case '%':
                 int remainder = a%b;
                 System.out.println("Remainder of a and b is:- " +remainder);
                 break;


             default:
                 System.out.print("Invalid input");
                 break;

         }
    }
}
