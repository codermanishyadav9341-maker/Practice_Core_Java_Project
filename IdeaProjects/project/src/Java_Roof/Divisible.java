package Java_Roof;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Number:- ");
        int num = scan.nextInt();

        if((num%5 == 0) && (num%11 == 0)){
            System.out.println( +num+ " is Divisible by 5 or 11" );
        }
         else{
             System.out.println(+num+ " is not Divisible by 5 or 11");
        }
    }
}
