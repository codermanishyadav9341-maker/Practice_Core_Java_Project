package WRAPPER;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        Integer num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        Integer num2 = scan.nextInt();

        System.out.print("Enter your Third number:- ");
        Integer num3 = scan.nextInt();

        Integer max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.print("Maximum Number is:- " +max);
    }
}
