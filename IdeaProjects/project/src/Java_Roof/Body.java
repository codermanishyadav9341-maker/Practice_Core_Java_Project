package Java_Roof;

import java.util.Scanner;

public class Body {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Body Mass Index:- ");
        double bmi = scan.nextDouble();

        if(bmi < 18.5){
            System.out.println("UnderWeight");
        }
         else if(bmi >= 18.5 && bmi <= 24.5){
             System.out.println("Normal");
        }
          else if(bmi >= 25 && bmi <= 29.9){
              System.out.println("OverWeight");
        }
           else if(bmi >= 30){
               System.out.println("Obese");
        }
    }
}
