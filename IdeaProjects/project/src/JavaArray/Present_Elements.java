package JavaArray;

import java.util.Scanner;

public class Present_Elements {
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
         for(int i= 0; i<size; i++){
             System.out.print(arr[i] + " ");
         }

         System.out.println();;
//          Checked elements;

        boolean found = false;
        System.out.print("Enter your Index elements:- ");
         int num = scan.nextInt();

         for(int i = 0; i<size; i++){
             if(arr[i] == num){
                 found = true;
                 break;

             }
         }


         if(found == true){
             System.out.println("Elements Present in Array:- " +num);
         }
          else{
              System.out.println("Elements is not Presents in Array:- " +num);
         }
    }
}
