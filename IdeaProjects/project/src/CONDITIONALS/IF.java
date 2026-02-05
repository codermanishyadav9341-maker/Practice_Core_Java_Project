package CONDITIONALS;

//import java.util.Scanner;
//
//public class IF {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Years:- ");
//        int years = scan.nextInt();
//
//        if(years%4==0){
//            if(years%100==0){
//                if(years%400==0){
//                    System.out.print("Leap Years");
//                }
//                 else{
//                     System.out.print("Not Leap Years");
//                }
//            }
//            else{
//                System.out.print("Leap Years");
//            }
//        }
//        else{
//            System.out.print("Not Leap Years");
//        }
//    }
//}


// Questions no .2;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//          System.out.print("Enter Your Characters:- ");
//          char ch = scan.next().charAt(0);
//
//          if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
//              System.out.print("Alphabet");
//          }
//           else{
//               System.out.print("It is not Alphabet");
//          }
//    }
//}


// Questions no.3;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Characters:- ");
//        char ch = scan.next().charAt(0);
//
//
//        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//
//            System.out.print("Vowel");
//        }
//         else{
//            System.out.print("Consonant");
//        }
//    }
//}


// Questions no .4;

//import java.util.Scanner;
//
//public class IF {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Characters:- ");
//        char ch = scan.next().charAt(0);
//
//
//        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
//            System.out.print("Alphabet");
//        } else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
//                System.out.print("Number");
//            }
//                else{
//                    System.out.print("Special Characters");
//        }
//        }
//    }
//


//    Questions no. 5;


//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your character:- ");
//        char ch = scan.next().charAt(0);
//
//        if(ch >= 'A' && ch <= 'Z'){
//            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//                System.out.print("UPPERCASE VOWEL");
//            }
//             else{
//                System.out.print("UPPERCASE CONSONANT");
//            }
//        }
//         else if(ch >= 'a' && ch <= 'z'){
//                  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                   System.out.print("LOWERCASE VOWEL");
//               }
//                else{
//                   System.out.print("LOWERCASE CONSONANT");
//               }
//        }
//
//
//    }
//}


// Questions no. 6;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first angle1:- ");
//        int angle_1  = scan.nextInt();
//
//        System.out.print("Enter your Second angle2:- ");
//        int angle_2 = scan.nextInt();
//
//        System.out.print("Enter your Third angle3:- ");
//        int angle_3 = scan.nextInt();
//
//        int result = (angle_1 + angle_2 + angle_3);
//
//        if(result == 180){
//            System.out.print("It is Valid of triangle");
//        }
//         else{
//             System.out.print("It is not valid of triangle");
//        }
//    }
//}

// Questions no. 7;

//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first angle1:- ");
//        int angle_1 = scan.nextInt();
//
//        System.out.print("Enter your Second angle2:- ");
//        int angle_2 = scan.nextInt();
//
//        System.out.print("Enter your Third angle3:- ");
//        int angle_3 = scan.nextInt();
//
//        if((angle_1 == angle_2) && (angle_2 == angle_3)){
//            System.out.print("Equilateral triangle");
//        }
//          else if((angle_1 == angle_3) || (angle_1 == angle_2)){
//
//              System.out.print("Isosceles triangle");
//        }
//           else{
//               System.out.print("Scalene triangle");
//        }
//
//    }
//}



// Questions no. 8;


//import java.util.Scanner;
//
//public class IF{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Physics_Marks:- ");
//        float physics_marks = scan.nextFloat();
//
//        System.out.print("Enter your Chemistry_Marks:- ");
//        float chemistry_marks = scan.nextFloat();
//
//        System.out.print("Enter your Biology_Marks:- ");
//        float biology_marks = scan.nextFloat();
//
//        System.out.print("Enter your Mathematics_Marks:- ");
//        float mathematics_marks = scan.nextFloat();
//
//        System.out.print("Enter your Computer_Marks:- ");
//        float computer_marks = scan.nextFloat();
//
//        float percentage = (physics_marks + chemistry_marks +biology_marks +mathematics_marks + computer_marks)/500*100;
//
//           if(percentage >= 90){
//               System.out.print("Grade A");
//           }
//            else if(percentage >= 80){
//                System.out.print("Grade B");
//
//           }
//             else if(percentage >= 70){
//                 System.out.print("Grade C");
//           }
//              else if(percentage >= 60){
//                  System.out.print("Grade D");
//           }
//               else if(percentage >= 40){
//                   System.out.print("Grade E");
//           }
//                else if(percentage < 40){
//                    System.out.print("Grade F");
//           }
//    }
//}


// Questions no .10;

//import java.util.Scanner;
//
//public class IF{
//       public static void main(String[] args){
//
//           Scanner scan = new Scanner(System.in);
//
//           System.out.print("Enter your Electricity Units:- ");
//           int electricity_units = scan.nextInt();
//
//           if(electricity_units <= 50){
//               System.out.print("Rs:- 0.50/units");
//           }
//            else if(electricity_units < 100){
//                System.out.print("Rs:- 0.75/units");
//           }
//             else if(electricity_units <= 100){
//                 System.out.print("Rs:- 1.20/units");
//           }
//              else if(electricity_units >= 250){
//                  System.out.print("Rs:- 1.50/units");
//           }
//       }
//   }

