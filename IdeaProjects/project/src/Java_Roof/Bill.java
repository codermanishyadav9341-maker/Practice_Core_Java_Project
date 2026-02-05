package Java_Roof;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Units:-");
        int units = scan.nextInt();

        if(units <= 100){
            System.out.println("5 per units");
        }
         else if(units <= 300){
             System.out.println("7 per Units");
        }
          else if(units > 300){
              System.out.println("10 per units");
        }
    }
}
