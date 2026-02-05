package Java_Roof;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Age:- ");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("Eligible for Voting");
        }
          else{
              System.out.println("Not Eligible for Voting");
        }
    }
}
