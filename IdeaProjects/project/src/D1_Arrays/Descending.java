package D1_Arrays;

import java.util.Scanner;

public class Descending {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array Elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

//         Descending Order;
        System.out.println();

        for(int i = 0; i<size-1; i++){
            for(int j = 0; j<size-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.print("Descending Orders:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
