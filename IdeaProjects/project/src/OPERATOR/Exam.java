package OPERATOR;

import java.util.Scanner;

//public class Exam {
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
//        int sum = (num1 +num2);
//
//        System.out.println("Sum of two number:- " +sum);
//
//        System.out.println("      ");
//
//        int sub = (num1 - num2);
//
//        System.out.println("Subtractions of two number:- " +sub);
//
//    }
//}


// Questions no. 2;


//public class Exam{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        int result = num++ + num++ + num++ + ++num;
//
//        System.out.print("Pre Increment:- " +result);
//    }
//}

// Questions no. 3;

//public class Exam{
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
//        String result1 = (num1 == num2) ? "True" : "False";
//        String result2 = (num1 != num2)  ? "True" : "False";
//        String result3 = (num1 > num2) ? "True" : "False";
//        String result4 =  (num1 >= num2) ? "True" : "False";
//        String result5 =  (num1 < num2) ? "True" : "False";
//        String result6 =  (num1 <= num2) ? "True" : "False";
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);
//
//
//
//
//    }
//}


//  Questions no. 4;

//public class Exam{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your number:- ");
//        int num = scan.nextInt();
//
//        if(num%2==0){
//            System.out.print(+num+ " is Even number");
//        }
//         else{
//             System.out.print(+num+ " is Odd number");
//        }
//    }
//}

// Questions no .5;

//public class Exam{
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
//        if(num1 >= num2){
//            System.out.print(+num1+ " is Largest number");
//        }
//         else{
//             System.out.print(+num2+ " is Largest number");
//        }
//    }
//}

// Questions no. 6;


public class Exam{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Before Swap:- ");

        System.out.println("a = " +a  + " b = " +b);


        System.out.println("After Swap:- ");

        a = a ^ b;
        b = a ^ b;     // USING BITWISE OPERATORS;
        a = a ^ b;

        System.out.println("a = " +a + " b = " +b);

    }
}


