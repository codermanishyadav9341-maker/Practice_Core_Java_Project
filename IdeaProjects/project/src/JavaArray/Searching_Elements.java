package JavaArray;

import java.util.Scanner;

public class Searching_Elements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        boolean flag = false;

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // Searching elements;

        System.out.print("Enter your Index No:- ");
        int index_No = scan.nextInt();


        if(index_No >= 0 && index_No < size){
            System.out.println("Index No:- " +index_No+ " or Value is:- " +arr[index_No]);
        }
        else{
            System.out.println("Invalid elements this is not present in Array");
        }


    }
}
