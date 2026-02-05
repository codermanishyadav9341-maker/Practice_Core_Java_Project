package ArrayListPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Count_Even_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter your ArrayList Size:- ");
        int size = scan.nextInt();

        System.out.println("Enter Your ArrayList elements:- ");
         for(int i = 0; i<size; i++){
             list.add(scan.nextInt());
         }

         System.out.println("ArrayList:- " +list);

         for(int num: list){
             if(num%2==0){
                 evenCount++;
             }
             else{
                 oddCount++;
             }
         }

         System.out.print("Even digit:- " +evenCount+ " \nOdd digit:- " +oddCount);

    }
}
