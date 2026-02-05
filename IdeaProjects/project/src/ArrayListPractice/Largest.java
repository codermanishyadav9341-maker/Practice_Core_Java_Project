package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Largest {
    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();

        number.add(5);
        number.add(7);
        number.add(2);
        number.add(9);
        number.add(1);

        System.out.println("ArrayList:- " +number);
        int largestValue = Collections.min(number);

        System.out.println("Large:- " +largestValue);
    }
}
