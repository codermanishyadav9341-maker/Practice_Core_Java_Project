package JavaLoop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        boolean isPrime = true;

        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print(num+ " is a Prime number");
        }
         else{
             System.out.print(num+ " is not Prime number");
        }
    }
}
