package ArrayListPractice;

import java.util.ArrayList;

public class Remove_Duplicate {
    public static void main(String[] args){

        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("Duplicates elements");
        System.out.println("ArrayList:- " +list);


        ArrayList <Integer> UniqueList = new ArrayList<>();

        for(int num: list){
            if(!UniqueList.contains(num)){
                UniqueList.add(num);
            }
        }
        System.out.println("Unique ArrayList:- " +UniqueList);
    }
}
