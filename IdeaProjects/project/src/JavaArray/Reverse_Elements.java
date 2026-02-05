package JavaArray;

import java.util.Scanner;

public class Reverse_Elements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter your Array elements:- ");
         for(int i = 0; i<size; i++){
             arr[i] = scan.nextInt();
         }

         System.out.print("Array elements:- ");
         for(int i = 0; i<size; i++){
             System.out.print(arr[i] + " ");
         }

         System.out.println();

         for(int i = 0; i<size/2; i++){
             int temp = arr[i];
             arr[i] = arr[size-1-i];
             arr[size-1-i] = temp;
         }

         System.out.print("Reverse Array elements:- ");
         for(int i = 0; i<size; i++) {
             System.out.print(arr[i] + " ");
         }
    }
}
