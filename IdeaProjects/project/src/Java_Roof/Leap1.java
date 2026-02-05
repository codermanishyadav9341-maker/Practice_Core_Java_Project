package Java_Roof;

import java.util.Scanner;

public class Leap1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Years:- ");
        int years = scan.nextInt();

        if(years%4==0){
            if(years%100==0){
                if(years%400==0){
                    System.out.println(years+ " is Leap Years");
                }
                 else{
                     System.out.println(years+ " is not Leap Years");
                }
            }
             else{
                 System.out.println(years+ " is Leap Years");
            }
        }
         else{
             System.out.println(years+ " is not Leap Years");
        }
    }
}
