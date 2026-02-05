package Java_Roof;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------=========:MENU:========-----------------");
        System.out.println("1. Add two number:");
        System.out.println("2. Subtract two numbers:");
        System.out.println("3. Multiply two number:");
        System.out.println("4. Exit");
        System.out.print("Enter your Choice:-(1,2,3,4,5,6):-  ");
        int choice = scan.nextInt();

           switch(choice){

               case 1:
                  System.out.print("Enter your 1st menu:- ");
                  int a = scan.nextInt();

                  System.out.print("Enter your 2nd menu:- ");
                  int b = scan.nextInt();

                  int total = (a+b);
                  System.out.println("Total:- " +(a+b));
                  break;


               case 2:
                   System.out.print("Enter your 1st menu:- ");
                   int x = scan.nextInt();

                   System.out.print("Enter your 2nd menu:- ");
                   int y = scan.nextInt();

                   int result = x-y;

                   System.out.println("Subtract:- " +result);
                   break;


               case 3:
                   System.out.print("Enter 1st menu:- ");
                   int num = scan.nextInt();

                   System.out.print("Enter 2nd menu:- ");
                   int num2 = scan.nextInt();

                   System.out.println("Multiply:- " +num*num2);
                   break;


               case 4:
                   System.out.println("Empty");
                   break;

               default:
                   System.out.println("Invalid Options");
           }

    }
}
