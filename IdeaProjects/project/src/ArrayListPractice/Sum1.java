package ArrayListPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Sum1 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList <> ();

        System.out.print("Enter your Size:- ");
        int size = Scan.nextInt();

        System.out.println("Enter Your ArrayList elements:- ");
        for(int i = 0; i<size; i++){
            list.add(Scan.nextInt());
        }

        System.out.println("ArrayList:- " +list);


        int sum = 0;

        for(int num : list){
            sum += num;
        }
        System.out.println("Sum of all elements:- " +sum);
    }
}
