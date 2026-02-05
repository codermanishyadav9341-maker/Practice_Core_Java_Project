package Java_Roof;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Radius:- ");
        int radius = scan.nextInt();

        double circumference = 2*3.14*radius;

        System.out.println("Circumference Of Circle:- " +circumference);

    }
}
