package JavaLoop;

import java.util.Scanner;

public class Alphabet1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Alphabet Characters:- ");
        char ch = scan.next().charAt(0);

        while(ch >= 'a'){
            System.out.print(ch +" ");
            ch--;
        }
    }
}
