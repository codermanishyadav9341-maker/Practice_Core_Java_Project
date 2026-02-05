package SWITCH;

import java.util.Scanner;

public class Case {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

              if((ch >= 'A') && (ch <= 'Z')){

                  switch(ch){

                      case 'A':
                      case 'E':
                      case 'I':
                      case 'O':
                      case 'U':

                          System.out.print("Capital Vowel");
                          break;

                      default:
                          System.out.print("Capital Consonant");
                          break;
                  }

              }
               else if((ch >= 'a') && (ch <= 'z')){
                          switch(ch){

                              case 'a':
                              case 'e':
                              case 'i':
                              case 'o':
                              case 'u':

                                  System.out.print("Small Vowel");
                                  break;

                              default:
                                  System.out.print("Small Consonant");
                          }
              }
    }
}


// Questions no. 3;

//import java.util.Scanner;
//
//public class Case{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your first number:- ");
//        int a = scan.nextInt();
//
//        System.out.print("Enter your Second number:- ");
//        int b = scan.nextInt();
//
//        System.out.print("Calculators:- (+,-,*,/,%%)" );
//        char ch = scan.next().charAt(0);
//
//        int result;
//
//            switch(ch){
//
//                case '+':
//                    result = (a+b);
//                System.out.print("Sum of a and b is:- " +result);
//                break;
//
//                case '-':
//                    result = (a-b);
//                    System.out.print("Sub of a and b is:- " +result);
//                    break;
//
//                case '*':
//                    result = (a*b);
//                    System.out.print("Product of a and b is:- " +result);
//                    break;
//
//                case '/':
//                    result = (a/b);
//                    System.out.print("Divided of a  and b is:- " +result);
//                    break;
//
//                case '%':
//                    result = (a % b);
//                    System.out.print("Remainder of a and b is:- " +result);
//                    break;
//
//                default:
//                    System.out.print("Invalid Input");
//                    break;
//
//            }
//    }
//}



// Questions no.4;

//import java.util.Scanner;
//
//public class Case{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Choose your Number(1,2,3,4,5,6,7):-  ");
//        int num = scan.nextInt();
//
//           switch(num){
//
//               case 1:
//                   System.out.print("Monday");
//                   break;
//
//               case 2:
//                   System.out.print("Tuesday");
//                   break;
//
//               case 3:
//                   System.out.print("Wednesday");
//                   break;
//
//               case 4:
//                   System.out.print("Thursday");
//                   break;
//
//               case 5:
//                   System.out.print("Friday");
//                   break;
//
//               case 6:
//                   System.out.print("Saturday");
//                   break;
//
//               case 7:
//                   System.out.print("Sunday");
//                   break;
//
//               default:
//                   System.out.print("Invalid Input");
//                   break;
//
//           }
//
//
//    }
//}



// Questions no.5;


//import java.util.Scanner;
//
//public class Case{
//      public static void main(String[] args){
//
//          Scanner scan = new Scanner(System.in);
//
//          System.out.print("Choose Your Options:-(Stop = 1/ Wait = 2/ Go = 3):-  ");
//          int num = scan.nextInt();
//
//          System.out.println("---------TRAFFIC LIGHT---------");
//
//             switch(num){
//
//                 case 1:
//                     System.out.print("Red");
//                     break;
//
//                 case 2:
//                     System.out.print("Yellow");
//                     break;
//
//                 case 3:
//                     System.out.print("Green");
//                     break;
//
//                 default:
//                     System.out.print("Invalid Input");
//                     break;
//
//
//
//             }
//
//      }
//  }