package ArrayListPractice;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args){

        ArrayList <Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        int sum = 0;

        for(int num : number){
            sum += num;
        }
        System.out.println("Sum of Elements:- " +sum);
    }
}
