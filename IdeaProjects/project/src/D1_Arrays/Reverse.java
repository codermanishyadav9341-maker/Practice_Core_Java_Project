package D1_Arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        int flag = 0;

        System.out.println("Enter your Array Elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        System.out.print("Reverse Elements:- ");
        for(int i = size-1; i>=0; i--){


            System.out.print(arr[i] +" ");
        }
    }
}
