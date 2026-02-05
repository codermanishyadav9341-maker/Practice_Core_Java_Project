package CONDITIONALS;

//import java.util.Scanner;
//
//public class Nested {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.print("Enter your Third number:- ");
//        int c = scan.nextInt();
//
//        if(a>b){
//            if(a>c){
//                System.out.print("A is Largest");
//            }
//             else{
//                 System.out.print("Smallest");
//            }
//        }
//         else if(b>a){
//               if(b>c){
//                   System.out.print("B is largest");
//               }
//                else{
//                    System.out.print("Smallest");
//               }
//        }
//          else if(c>b){
//                if(c>a){
//                   System.out.print("C is largest");
//               }
//                else{
//                    System.out.print("Smallest");
//               }
//
//        }
//    }
//}



// Questions no.2;


//import java.util.Scanner;
//
//public class Nested {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.print("Enter your Third number:- ");
//        int c = scan.nextInt();
//
//        System.out.print("Enter your Fourth number:- ");
//        int d = scan.nextInt();
//
//        int max;
//
//        if(a>b){
//            if(a>c){
//                if(a>d){
//                    max = a;
//                }
//                 else{
//                     max = d;
//                }
//            }
//             else if(b>c){
//                 max = b;
//            }
//              else{
//                  max = d;
//            }
//        }
//         else if(c>d){
//             max = c;
//        }
//          else{
//              max = d;
//        }
//
//          System.out.print("Maximum Number is :- " +max);
//
//    }
//}



// Questions no 3;

import java.util.Scanner;

public class Nested{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first user's name:- ");
        char name1 = scan.next().charAt(5);

        System.out.print("Enter " +name1 +"total marks");
        int marks1 = scan.nextInt();

        System.out.print("Enter your Second user's name");
        char name2 = scan.next().charAt(5);

        System.out.print("Enter " +name2+ "total's marks:- ");
        int marks2 = scan.nextInt();

        System.out.print("Enter your third user's name");
        char name3 = scan.next().charAt(5);

        System.out.print("Enter " +name3+ "total's marks");
        int marks3 = scan.nextInt();


        char first,second,third;
        int firstmarks,secondmarks,thirdmarks;

        if((marks1 >= marks2) && (marks1 >= marks3)){
             first = name1;
             firstmarks = marks1;


        }
         else if(marks2 > marks3){
             second = name2;
             secondmarks = marks2;
        }

    }
}