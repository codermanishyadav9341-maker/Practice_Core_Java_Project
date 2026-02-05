package JavaLoop;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int i = 0;

        while(i <= num){
            System.out.print(num);
        }
    }
}
