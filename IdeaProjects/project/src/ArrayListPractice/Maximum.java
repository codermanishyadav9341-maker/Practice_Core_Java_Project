package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum {
    public static void main(String[] args){

        ArrayList <Integer> number = new ArrayList<>();

        number.add(10);
        number.add(5);
        number.add(40);
        number.add(25);

        System.out.println("ArrayList:- " +number);
      int maxValue =   Collections.max(number);

        System.out.println("Maximum number is:- " +maxValue);
    }
}
