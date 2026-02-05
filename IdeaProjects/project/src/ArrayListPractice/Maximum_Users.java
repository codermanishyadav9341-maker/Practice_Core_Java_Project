package ArrayListPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Maximum_Users {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();

        System.out.print("Enter your ArrayList Size:- ");
        int size = scan.nextInt();

        System.out.println("Enter your ArrayList elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scan.nextInt());
        }

        System.out.println("ArrayList:- " +list);

//         Maximum;

        int max = list.get(0);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println("Maximum number:- " +max);




    }
}
