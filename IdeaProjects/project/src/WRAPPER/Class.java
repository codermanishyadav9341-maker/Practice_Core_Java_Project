package WRAPPER;

//import java.util.Scanner;
//
//public class Class {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//           System.out.print("Enter your number:- ");
//           int num = scan.nextInt();
//
//           Integer ab = num;  /// Autoboxing
//
//           System.out.print("Wrapper Object:- " +ab);
//
//    }
//}

//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//          System.out.print("Enter your Wrapper Object:- ");
//          Integer so = scan.nextInt();
//
//          int num = so;  //Unboxing ;
//
//          System.out.print("Primitive Value:- " +num);
//    }
//}
//


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number");
//         String so = scan.nextLine();
//
//         int num = Integer.parseInt(so);     // String Convert int to Primitive Data  Types;
//
//         System.out.print("Parsed Integer:- " +num);
//    }
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        String num1 = scan.nextLine();
//
//        int num = Integer.parseInt(num1);
//
//        System.out.print("Parsed Value:- " +num);
//
//    }
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] main){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Number:- ");
//        String str = scan.nextLine();
//
//        Integer num = Integer.valueOf(str);    //  String Convert in to Wrapper Object;
//
//        System.out.print("Wrapper Object:- " +num);
//
//    }
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        Integer num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        Integer num2 = scan.nextInt();
//
//        System.out.print("a = " +num1 +" \nb = " +num2);
//    }
//
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        Integer num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        Integer num2 = scan.nextInt();
//
//        if((num1 > num2) || (num2 > num1)){
//            System.out.print("Maximum");
//        }
//         else{
//             System.out.print("Minimum");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        String num1 = scan.nextLine();
//
//        int num = Integer.parseInt(num1);
//
//        System.out.print(num);
//    }
//}

//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Primitive Data Types:- ");
//        int num1 = scan.nextInt();
//
//        Integer num = num1;
//
//        System.out.print("Wrapper Object is:- " +num);
//
//    }
//}

//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Wrapper Object:- ");
//        Integer num = scan.nextInt();
//
//        int num1 = num;
//
//        System.out.print("Primitive Types:- " +num1);
//    }
//}


//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        String num = scan.nextLine();
//
//        int num1 = Integer.parseInt(num);
//
//        System.out.print("Primitive Types:- " +num1);
//    }
//}

//import java.util.Scanner;
//
//public class Class{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        String num = scan.nextLine();
//
//        Integer num1 = Integer.valueOf(num);
//
//        System.out.print("Wrapper Object:- " +num1);
//
//    }
//}


import java.util.Scanner;

public class Class{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your double number:- ");
        double num2 = scan.nextDouble();

        double sum = num1 + num2;

        System.out.print("Sum is:- " +sum);


    }


}