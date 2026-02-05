package JavaArray;

import java.util.Scanner;

 class EvenCount {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

         System.out.print("Enter your Size:- ");
         int size = scan.nextInt();

         int array[] = new int[size];

         System.out.println("Enter your Array Elements:- ");
         for(int i = 0; i<size; i++){
             array[i] = scan.nextInt();
         }

         System.out.print("Array elements:- ");
         for(int i = 0; i<size; i++){
             System.out.print(array[i] +" ");
         }

         System.out.println();
         int evenCount = 0;
         int oddCount = 0;

         for(int i = 0; i<size; i++){
             if(array[i]%2==0){
                 evenCount++;
             }
              else{
                  oddCount++;
             }
         }

         System.out.println("Even Count Digits:- " +evenCount);
         System.out.println("Odd Count Digits:- " +oddCount);

     }
}
