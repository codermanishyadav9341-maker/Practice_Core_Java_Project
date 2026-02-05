package Java_Roof;

import java.util.Scanner;

public class ASMD {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        int result1 = (num1 + num2);
        int result2 = (num1 - num2);
        int result3 = (num1 * num2);
        int result4 = (num1/num2);

        System.out.println("Sum of two Number:- " +result1);
        System.out.println("Subtract of two number:- " +result2);
        System.out.println("Multiply of two number:- " +result3);
        System.out.println("Division of two number:- " +result4);


    }
}
