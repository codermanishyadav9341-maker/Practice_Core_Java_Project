package CONDITIONS;

import java.util.Scanner;

//public class EXAM {
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
//        if(num1 > num2){
//            System.out.print(+num1+ " is Largest number");
//        }
//         else if(num2 > num1){
//             System.out.print(+num2+ " is Largest number");
//        }
//         else{
//             System.out.print("Both are equal ");
//        }
//    }
//}


// Questions no. 2;

//public class EXAM{
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
//                    System.out.print(+years+ " is Leap Years");
//                }
//                 else{
//                     System.out.print(+years+ " is not Leap Years");
//                }
//            }
//             else{
//                 System.out.print(+years+ " is Leap Years");
//            }
//        }
//         else{
//             System.out.print(+years+ " is not Years");
//        }
//    }
//
//}

// Questions no. 3;

//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Cost Price:- ");
//        int cost_Price = scan.nextInt();
//
//        System.out.print("Enter your Selling Price:- ");
//        int selling_Price = scan.nextInt();
//
//        int profit, loss;
//
//        if(cost_Price <= selling_Price){
//            profit = (selling_Price - cost_Price);
//            System.out.print("Profit is " +profit);
//        }
//         else{
//             loss = (cost_Price - selling_Price);
//
//             System.out.print("Loss is " +loss);
//        }
//    }
//}


//    Questions no. 4;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your 1st angles:- ");
//        int first_angles = scan.nextInt();
//
//        System.out.print("Enter your 2nd angles:- ");
//        int second_angles = scan.nextInt();
//
//        System.out.print("Enter your 3rd angles:- ");
//        int third_angles = scan.nextInt();
//
//        int sum = (first_angles +second_angles + third_angles);
//
//         if(sum == 180){
//             System.out.print("This triangle is valid for " +sum);
//         }
//          else{
//              System.out.print("This triangle is not valid for " +sum);
//         }
//    }
//}

//   Questions no. 5;

//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num >= 0){
//           if(num > 0){
//               System.out.print(+num+ " is a Positive number");
//           }
//            else{
//                System.out.print(+num+ " is a Zero");
//           }
//        }
//         else{
//             System.out.print(+num+ " is a Negative number");
//        }
//    }
//}


// Questions no . 6;


//public class EXAM{
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
//                    System.out.print(+years+ " is Leap Years");
//                }
//                 else{
//                     System.out.print(+years+ " is not Leap Years");
//                }
//            }
//             else{
//                 System.out.print(+years+ " is a Leap Years");
//            }
//        }
//         else{
//             System.out.print(+years+ " is not Leap Years");
//        }
//    }
//}


//   Questions no .7;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your 1st_angle:- ");
//        int first_angles = scan.nextInt();
//
//        System.out.print("Enter your 2nd_angle:- ");
//        int second_angles = scan.nextInt();
//
//        System.out.print("Enter your 3rd_angle:- ");
//        int third_angles = scan.nextInt();
//
//        if((first_angles == second_angles) && (second_angles == third_angles)){
//            System.out.print("Equilateral triangle");
//        }
//         else if((first_angles == second_angles) || (first_angles == third_angles)){
//             System.out.print("Isosceles triangle");
//        }
//          else{
//              System.out.print("Scalene triangle");
//
//        }
//    }
//}


// Questions no. 8;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if((num%2==0) && (num%3==0)){
//            System.out.print("This number is divisible by 2 and 3");
//        }
//         else{
//             System.out.print("This number is not divisible by 2 and 3");
//
//        }
//
//
//    }
//}

// Questions no. 9;

//public class EXAM{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Marks:- ");
//        float marks = scan.nextFloat();
//
//        if(marks >= 90){
//            System.out.print("Grade A");
//        }
//         else if(marks >= 75){
//             System.out.print("Grade B");
//        }
//          else if(marks >= 50){
//              System.out.print("Grade C");
//        }
//          else if(marks < 50){
//              System.out.print("Grade F");
//        }
//           else{
//               System.out.print("Fail");
//        }
//    }
//
//}


// Questions no. 10;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Electricity_Bill_Units:- ");
//        int units = scan.nextInt();
//
//        if(units <= 100){
//            System.out.print("₹5 per units");
//        }
//         else if(units <= 300){
//             System.out.print("₹7 per units");
//        }
//          else if(units > 300){
//              System.out.print("₹10 per units");
//        }
//    }
//}


//  Questions no. 11;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Body_Mass_Index:- ");
//        float bmi = scan.nextFloat();
//
//        if(bmi < 18.5){
//            System.out.print("UnderWeight");
//        }
//         else if((bmi >= 18.5) && (bmi <= 24.9)){
//             System.out.print("Normal");
//        }
//         else if((bmi >= 25) && (bmi <= 29.9)){
//             System.out.print("OverWeight");
//        }
//         else if(bmi >= 30){
//             System.out.print("Obese");
//        }
//    }
//}

//  Questions no. 12

//public class EXAM{
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
//        System.out.print("Enter your Choice:- +,-,* /,%% :--  ");
//        char ch = scan.next().charAt(0);
//
//        int result;
//
//               switch(ch){
//
//                   case '+':
//                     result = (a+b);
//                     System.out.print("Sum of two digit:- " +result);
//                     break;
//
//                   case '-':
//                       result = (a-b);
//                       System.out.print("Subtractions of two digits:- " +result);
//                       break;
//
//                   case '*':
//                       result = (a*b);
//                       System.out.print("Multiply of two digits:- " +result);
//                       break;
//
//                   case '/':
//                       result = (a/b);
//                       System.out.print("Division of two digits:- " +result);
//                       break;
//
//                   case '%':
//                       result = (a%b);
//                       System.out.print("Remainder of two digits:- " +result);
//                       break;
//
//                   default:
//                       System.out.print("Invalid Input");
//                       break;
//
//
//
//
//        }
//    }
//}


//   Questions no. 13;


//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your Characters:- ");
//        char ch = scan.next().charAt(0);
//
//
//             switch(1){
//
//                 case 1:
//                      if((ch >= 'A') && (ch <= 'Z')){
//                          System.out.print(+ch+ " is UpperCase characters");
//                          break;
//
//                      }
//                       else if((ch >= 'a') && (ch <= 'z')){
//                           System.out.print(+ch+ " is LowerCase Characters");
//                           break;
//                      }
//                       else if((ch >= '0') && (ch <= '9')){
//                           System.out.print("Digits");
//                           break;
//                      }
//                        else{
//                            System.out.print("Special characters");
//                            break;
//                      }
//
//
//        }
//    }
//}


// Questions no. 14;

//public class EXAM{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("\n========MENU - REPORT==========");
//        System.out.println("1. Add two number");
//        System.out.println("2. Substractions of two number");
//        System.out.println("3. Multiply two number");
//        System.out.println("5. Exit");
//
//        System.out.print("-------=========----------");
//        int choice;
//
//        System.out.print("\nEnter your choice(1 , 2 , 3 , 4):-   ");
//        choice = scan.nextInt();
//        double num1 ,num2;
//        double result;
//
//              switch (choice){
//
//                  case 1:
//                      System.out.print("Enter your first number:- ");
//                      num1 = scan.nextDouble();
//
//                      System.out.print("Enter your Second number:- ");
//                      num2 = scan.nextDouble();
//
//                      result = (num1 + num2);
//                      System.out.print("Results:- " +result);
//                      break;
//
//                  case 2:
//                      System.out.print("Enter your first number:- ");
//                      num1 = scan.nextDouble();
//
//                      System.out.print("Enter your Second number:- ");
//                       num2 = scan.nextDouble();
//
//                       result = (num1 - num2);
//
//                       System.out.print("Result:- " +result);
//                       break;
//
//
//                  case 3:
//                      System.out.print("Enter your first number:- ");
//                      num1 = scan.nextDouble();
//
//                      System.out.print("Enter your Second number:- ");
//                      num2 = scan.nextDouble();
//
//                      result = (num1*num2);
//
//                      System.out.print("Result:- " +result);
//                      break;
//
//                  case 4:
//                      System.out.print("-------Existing the Program GoodBye------");
//                      break;
//
//                  default:
//                      System.out.print("Invalid choice");
//                      break;
//
//              }
//
//    }
//}


//   Questions no. 15;


public class EXAM{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        String result = (num%2==0) ?  " Even number" : "Odd number";

        System.out.print(result);
    }
}