package Java_Roof;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Characters:- ");
        int ch1 = scan.next().charAt(0);

        System.out.print("Enter your Last Characters:- ");
        int ch2 = scan.next().charAt(0);

        while(ch1 <= ch2){
            System.out.print(ch1 +" ");
            ch1++;
        }
    }
}
