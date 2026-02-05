package Java_Roof;

import java.util.Scanner;

public class even1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        String result = (num%2==0) ? "even number" : "odd number";
        System.out.println(result);

    }
}
