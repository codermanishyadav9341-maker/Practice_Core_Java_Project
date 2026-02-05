package JavaArray;

import java.util.*;

public class Delete {
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

        System.out.print("Enter your Deleting elements:- ");
        int num = scan.nextInt();

        int found = -1;

        for(int i = 0; i<size; i++){
            found = i;
            break;
        }

      for(int i = found; i<size-1; i++){
          arr[i] = arr[i+1];
      }

      System.out.print("Array deletions elements:- ");
      for(int i = 0; i<size-1; i++){
          System.out.print(arr[i] + " ");
      }
    }
}
