package JavaLoop;

import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }

        System.out.println("Count Digits:- " +count);
    }
}
