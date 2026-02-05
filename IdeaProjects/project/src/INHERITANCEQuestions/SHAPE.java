package INHERITANCEQuestions;

import java.util.Scanner;

class SHAPE {

    void area(){
        System.out.print("Calculating area.....");
    }
}

class Rectangle extends SHAPE{

     void area(){
         Scanner scan = new Scanner(System.in);

         System.out.print("Enter your length:- ");
         int len = scan.nextInt();

         System.out.print("Enter your breath:- ");
         int bre = scan.nextInt();

         int area = (len * bre);

         System.out.print("Area of rectangle:- " +area) ;
     }
     public static void main(String[] args){

         Rectangle scan = new Rectangle();

         scan.area();
     }
}
