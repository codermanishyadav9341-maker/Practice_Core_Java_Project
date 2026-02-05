package Exception;

//public class Division {
//    public static void main(String[] args){
//
//        try{
//            int a = 10;
//            int b = 0;
//
//            int c = a/b;
//            System.out.println(c);
//        }
//
//        catch(Exception e){
//            System.out.println(e);
//            System.out.println("Cannot divide by Zero");
//
//        }
//    }
//}


import java.util.Scanner;

public class Division{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Enter your first number:- ");
            int a = scan.nextInt();

            System.out.print("Enter your Second number:- ");
            int b = scan.nextInt();

            int c = a/b;
        }
        catch(Exception e){

            System.out.println(e);
            System.out.println("Cannot divide by Zero");
        }
    }
}