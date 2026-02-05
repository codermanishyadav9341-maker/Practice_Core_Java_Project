package Java_Roof;

import java.util.Scanner;

public class largest2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your 2nd number:- ");
        int b = scan.nextInt();

        System.out.print("Enter your 3rd number:- ");
        int c = scan.nextInt();

        int largest = (a > b) ? ( a > c ? a : c):
                (b > c ? b : c);
        System.out.println("Largest number:- " +largest);
    }
}
