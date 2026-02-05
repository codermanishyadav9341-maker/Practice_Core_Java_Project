package ROOF;

import java.util.Scanner;

//public class NESTED {
//       public static void main(String[] args){
//
//           Scanner scan = new Scanner(System.in);
//
//           System.out.print("Enter your first number:- ");
//           int num1 = scan.nextInt();
//
//           System.out.print("Enter your Second number:- ");
//           int num2 = scan.nextInt();
//
//           System.out.print("Enter your Third number:- ");
//           int num3 = scan.nextInt();
//
//           if(num1 >= num2){
//               if(num1 >= num3){
//                   System.out.print("Largest number is" +num1);
//               }
//                 else{
//                     System.out.print("Largest number is " +num3);
//               }
//           }
//            else if(num2 >= num3){
//                System.out.print("Largest number is " +num2);
//           }
//
//       }
//}


// Questions no. 2;


//public class ELSE{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Enter your Third number:- ");
//        int num3 = scan.nextInt();
//
//        System.out.print("Enter your fourth number:- ");
//        int num4 = scan.nextInt();
//
//        if(num1 >= num2){
//            if(num1 >= num3){
//                if(num1 >= num4){
//                    System.out.print("Maximum number is " +num1);
//                }
//                 else{
//                     System.out.print("Maximum number is " +num4);
//                }
//            }
//            else if(num3 >= num4){
//                System.out.print("Maximum number is " +num3);
//            }
//
//        }
//         else if(num2 >= num3){
//                if(num2 >= num4){
//                    System.out.print("Maximum number is " +num2);
//                }
//                 else{
//                     System.out.print("Maximum number is " +num4);
//                }
//        }
//          else if(num3 >= num4){
//              System.out.print("Maximum number is " +num3);
//        }
//           else{
//               System.out.print("Maximum number is " +num4);
//        }
//    }
//}



//  Questions no. 3;


//public class ELSE{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Enter your Third number:- ");
//        int num3 = scan.nextInt();
//
//        int temp;
//
//        if(num1 >= num2){
//            temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
//         else if(num1 >= num3){
//             temp = num1;
//             num1 = num3;
//             num3 = temp;
//        }
//          else if(num2 >= num3){
//              temp = num2;
//              num2 = num3;
//              num3= temp;
//        }
//
////          DISPLAY
//
//        System.out.print("Ascending order is :-  " +num1+ " ," +num2+ " ," +num3);
//    }
//}


//  Questions no.4;

//public class ELSE{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first Student name:- ");
//        char name1 = scan.next().charAt(0);
//
//        System.out.print("Enter your Second student name:- ");
//        char name2 = scan.next().charAt(0);
//
//        System.out.print("Enter your Third student name:- ");
//        char name3 = scan.next().charAt(0);
//
//
//        System.out.println("                 ");
//
//
//        System.out.print("Enter your Physics marks:- ");
//        int marks1 = scan.nextInt();
//
//        System.out.print("Enter your Chemistry marks:- ");
//        int marks2 = scan.nextInt();
//
//        System.out.print("Enter your Mathematics marks:- ");
//        int marks3 = scan.nextInt();
//
//        char first , second , third;
//        int f_marks1 , f_marks2 , f_marks3;
//
//        if(marks1 >= marks2  && marks1 >= marks3){
//
//            first = name1;
//            f_marks1 = marks1;
//
//        }
//         else if(marks2 >= marks3){
//              second = name2;
//              f_marks2 = marks2;
//        }
//          else if(marks2 >= marks1 && marks2 >= marks3){
//              first = name2;
//
//        }
//    }
//}




//  Questions no. 5;



//public class ELSE{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num >= 0){
//            if(num > 0){
//                System.out.print("Positive number is " +num);
//            }
//             else{
//                 System.out.print("Zero is " +num);
//            }
//        }
//         else{
//             System.out.print("Negative number is " +num);
//        }
//    }
//}



// Questions no. 6;


public class NESTED{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Month_number(1 - 12):- ");
        int month = scan.nextInt();

        int years;

        if(month == 2){

            System.out.print("Enter your Years:- ");
             years = scan.nextInt();

            if((years%4==0) || (years%100==0) && (years%400 != 0)){
                System.out.print("February has 29 days in " +years);
            }
             else{
                 System.out.print("February has 28 days is " +years);
            }

        }
         else if(month == 4 || month == 6 || month == 9 || month == 11){
             System.out.print("Month has 30 days is " +month);
        }
         else{
             System.out.print("Month has 31 days is  " +month);
        }
    }
}