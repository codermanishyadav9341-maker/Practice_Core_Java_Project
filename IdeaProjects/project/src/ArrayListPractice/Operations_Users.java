package ArrayListPractice;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Operations_Users {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<> ();


        System.out.println("Enter your ArrayList Size:- ");
        int size = scan.nextInt();

        System.out.println("Enter your ArrayList elements:- ");
         for(int i = 0; i<size; i++){
             list.add(scan.next());
         }
         System.out.println("ArrayList:- " +list);

         list.remove(1);
         System.out.println("Remove List:- " +list);

         list.set(1,"Go");
         System.out.println("Update List:- " +list);

    }
}
