package D1_Arrays;

import java.util.Scanner;

public class Array_Present {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        int num;
        int flag = 0;

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        System.out.print("Searching elements:- ");
         num = scan.nextInt();

         for(int i = 0; i<size; i++){
             if(arr[i] == num){
                 flag = 1;




                 System.out.println(+num +" is Present in Array");
                 break;

             }


         }
         if(flag==0){
             System.out.println(+num+ " is not Present in Array");

         }
    }
}
