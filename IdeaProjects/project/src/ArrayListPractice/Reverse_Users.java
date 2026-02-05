package ArrayListPractice;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Reverse_Users {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<> ();

        System.out.print("Enter your ArrayList Size:- ");
        int size = scan.nextInt();

        System.out.println("Enter your ArrayList elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.println("ArrayList:- " +list);

//         Reverse;
        for(int i = 0; i<list.size()/2; i++){
            int temp = list.get(i);
            list.set(i,list.get(list.size() - 1 -i));
            list.set(list.size()-1-i,temp);
        }


        System.out.println("Reverse Arraylist:- " +list);



    }
}
