package Exception_Questions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        try{

            int c = a/b;
            System.out.println("Value of C is:- " +c);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Cannot divide by Zero");
        }
    }
}
