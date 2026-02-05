package ArrayListPractice;

import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<> ();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList:- " +list);




        if(list.contains(20)){
            System.out.println(list.contains(20));
        }
         else{
             System.out.println(list.contains(20));
        }

    }
}
