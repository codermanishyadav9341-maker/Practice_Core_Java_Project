package JavaLoop;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int first_digit = 0;
        int last_digit = 0;

        last_digit = num%10;

        while(num > 10){
            num = num/10;
            first_digit = num;
        }

        System.out.println("First Digits:- " +first_digit);
        System.out.println("Last Digits:- " +last_digit);

    }
}
