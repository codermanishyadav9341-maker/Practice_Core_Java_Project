package Exception_Questions;

import java.util.Scanner;

public class Multiple_Catch {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter your Array Elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array Elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        try {
            System.out.println(arr[1]);

            try {

                System.out.print("Enter your first number:- ");
                int a = scan.nextInt();

                System.out.print("Enter your Second number:- ");
                int b = scan.nextInt();

                int c = a/b;

                System.out.println("Value of c is :- " +c);

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Cannot Divide by Zero");
            }
        }
         catch(Exception r){

            System.out.println(r);
            System.out.println("Inside out of bond");
         }
    }
}
