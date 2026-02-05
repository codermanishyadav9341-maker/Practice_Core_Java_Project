package JavaLoop;

import java.util.Scanner;

public class Base {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Base:- ");
        int base = scan.nextInt();

        System.out.print("Enter your Power:- ");
        int power = scan.nextInt();

          int result = 1;

        while(power != 0){
            result = result * base;
            power--;
        }

        System.out.println(result);
    }
}
