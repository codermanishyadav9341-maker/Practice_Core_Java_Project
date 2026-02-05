package Array;



import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int arr[] = new int[size];

         arr[0] = 101;
         arr[1] = 102;

         System.out.println("Index no:0- " +arr[0]);
         System.out.println("Index no 1.- " +arr[1]);

        System.out.println("------------");




         for(int i = 0; i<size; i++){
           arr[i] = scan.nextInt();
             System.out.println("Array list:- " +arr[i]);
         }

         System.out.println("------------");

        for(int i = 0; i< arr.length; i++){
            System.out.println("Array list:- " +arr[i]);
        }


    }

}
