package Java_Roof;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your 1st angle:- ");
        int angle_1st = scan.nextInt();

        System.out.print("Enter your 2nd angle:- ");
        int angle_2nd = scan.nextInt();

        System.out.print("Enter your 3rd angle:- ");
        int angle_3rd = scan.nextInt();

        if((angle_1st > 0 && angle_2nd > 0 && angle_3rd > 0) && (angle_1st + angle_2nd + angle_3rd == 180)){
            System.out.println("This triangle is valid");
        }
        else{
            System.out.println("This triangle is not valid");
        }
    }
}
