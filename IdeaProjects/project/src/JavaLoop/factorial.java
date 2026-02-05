package JavaLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int i = 1;
        int factorial = 1;

        while(i <= num){
            factorial *= i;
            i++;
        }
        System.out.print(factorial);
    }
}
