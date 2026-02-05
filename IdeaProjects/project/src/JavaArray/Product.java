package JavaArray;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Box Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }


        System.out.print("Array Elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int product = 1;

        for(int i = 0; i<size; i++){
            product *= arr[i];
        }
        System.out.println("Product:- " +product);
    }
}
