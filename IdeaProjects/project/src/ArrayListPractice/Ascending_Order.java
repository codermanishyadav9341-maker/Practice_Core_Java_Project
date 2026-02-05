package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Ascending_Order {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);


        System.out.println("Before Sorting:- ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After Sorting:- ");
        System.out.println(list);


    }
}
