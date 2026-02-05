package Java_Roof;

import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your third number:- ");
        int c = scan.nextInt();

        boolean result = ((a>b) && (a<b) || (a <c));

            System.out.println("Result:- " +result);
        }
    }

