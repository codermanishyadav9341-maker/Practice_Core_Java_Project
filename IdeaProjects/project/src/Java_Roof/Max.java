package Java_Roof;

import java.util.Scanner;

public class Max {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:-  ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

      if(a >= b){
          System.out.println("Maximum number");
      }
       else{
           System.out.println("Minimum number");
      }
    }
}
