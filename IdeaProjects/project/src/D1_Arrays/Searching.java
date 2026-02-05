package D1_Arrays;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        int index;


        System.out.println("Enter your Array elements:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Array Elements:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Index no:- ");
        index = scan.nextInt();

        for (int i = 0; i < size; i++) {
            if (index >= 0 && index < size) {
                System.out.println("Index Value:- " + arr[index]);
                break;

            } else {
                System.out.println("Invalid index no");
                break;
            }


        }
    }
}
