package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        System.out.println("Before Reverse:- ");
        System.out.println(number);

        Collections.reverse(number);

        System.out.println("After Reverse:- " );
        System.out.println(number);
    }
}
