package ArrayListPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Largest_Users {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();

        System.out.println("Enter your ArrayList Size:- ");
        int size = scan.nextInt();

        System.out.println("Enter your ArrayList elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.println("ArrayList:- " +list);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: list){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
             else if(num > secondLargest && num != largest){
                 secondLargest = num;
            }
        }

        System.out.println("Second Largest Number:- " +secondLargest);
    }
}
