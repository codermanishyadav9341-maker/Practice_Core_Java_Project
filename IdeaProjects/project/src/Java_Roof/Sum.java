package Java_Roof;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        float num2 = scan.nextFloat();

        float sum = (num1 +num2);

        System.out.println("Sum of two number is:- " +sum);
    }
}
