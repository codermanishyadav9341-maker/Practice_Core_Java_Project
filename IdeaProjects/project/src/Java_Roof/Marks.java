package Java_Roof;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your English_Marks:- ");
        double english_Marks = scan.nextDouble();

        System.out.print("Enter your Hindi Marks:- ");
        double hindi_Marks = scan.nextDouble();

        System.out.print("Enter your Maths Marks:- ");
        double maths_Marks = scan.nextDouble();

        double total_Marks = (english_Marks + hindi_Marks + maths_Marks);

        double percentage = total_Marks/3.0;

        System.out.println("---------Result--------");
        System.out.println("Total_Marks:- " +total_Marks);
        System.out.println("Percentage:- " +percentage);
    }
}
