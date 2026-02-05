package Java_Roof;

import java.util.Scanner;

public class Infinity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Number:- ");
        int num = scan.nextInt();

        int i = 0;
        while(i <= num){
            System.out.print(num);
        }
    }
}
