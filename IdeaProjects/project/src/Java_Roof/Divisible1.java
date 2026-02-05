package Java_Roof;

import java.util.Scanner;

public class Divisible1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

       if(num%2 == 0) {
           if (num % 3 == 0) {
               System.out.println(num + " is divisible by 2 or 3");
           }
            else{
                System.out.println(num+ " is not divisible by 2 or 3");
           }
       }
        else{
            System.out.println(num+ " is not divisible by 2 or 3");
       }
    }
}
