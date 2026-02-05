package Exception_Questions;

import java.util.Scanner;
import java.util.ArrayList;



public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter for Array elements:- ");
         for(int i = 0; i<size; i++){
             arr[i] = scan.nextInt();
         }

         System.out.print("Array elements:- ");

         for(int i = 0; i<size; i++){
             System.out.println(arr[i] +" ");
         }

         try{
             System.out.println(arr[10]);
         }
          catch(Exception e){
             System.out.println(e);
             System.out.println("Invalid array index");
          }
    }
}
