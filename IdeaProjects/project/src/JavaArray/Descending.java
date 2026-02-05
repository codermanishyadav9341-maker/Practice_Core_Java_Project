package JavaArray;

import java.util.*;

public class Descending {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Size:- ");
        int size = scan.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        Descending order;

        for(int i = 0; i<size-1; i++){
            for(int j = 0; j<size-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Descending Order:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
