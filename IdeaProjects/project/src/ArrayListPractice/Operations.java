package ArrayListPractice;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

//         Adding Containers;

        System.out.println("ArrayList:- " +list);

//         Removing containers one elements:-

        list.remove(1);
        System.out.println("ArrayList2:- " +list);

//         Update elements;

        list.set(1,"Go");
        System.out.println("ArrayList3:- " +list);

    }
}
